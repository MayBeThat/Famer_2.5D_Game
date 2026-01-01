package farmgame.engine;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

import farmgame.crop.Carrot;
import farmgame.crop.Sunflower;
import farmgame.crop.Tomato;
import farmgame.entity.Player;
import farmgame.environment.*;
import farmgame.input.InputHandler;
import farmgame.crop.Crop;


public class GamePanel extends JPanel {

    // Kích thước màn hình
    public static final int TILE_SIZE = 48;
    public static final int SCREEN_COL = 16;
    public static final int SCREEN_ROW = 12;

    public static final int SCREEN_WIDTH = TILE_SIZE * SCREEN_COL;
    public static final int SCREEN_HEIGHT = TILE_SIZE * SCREEN_ROW;


    private GameLoop gameLoop;
    private Player player;
    private InputHandler input;
    private ArrayList<Crop> crops;
    private ArrayList<EnvironmentObject> objects;
    private Chest chest;

    public GamePanel() {

        // Set kích thước panel
        this.setPreferredSize(
                new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT)
        );
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

        // Input
        input = new InputHandler();
        this.addKeyListener(input);
        this.setFocusable(true);

        // Player
        player = new Player(input);

        //crop
        crops = new ArrayList<>();
        crops.add(new Carrot(233,323));

        //enviroment
        objects = new ArrayList<>();

        // Game loop
        gameLoop = new GameLoop(this);
    }

    public void startGame() {
        gameLoop.start();
    }

    // Logic game
    public void update() {
     player.update();
//     if(input.interactPressed && chest.isNearPlayer(player)) {
//            chest.interact(player);
//        }
    }

    // Vẽ game
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        player.render(g2);
//        for (Crop crop : crops) {
//            crop.render(g2);
//        }
//        for (EnvironmentObject object : objects) {
//            object.render(g2);
//        }
//        chest.render(g2);
        g2.dispose();
    }
}
