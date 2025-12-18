package farmgame.engine;

import javax.swing.JPanel;
import java.awt.*;

import farmgame.entity.Player;
import farmgame.input.InputHandler;

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

        // Game loop
        gameLoop = new GameLoop(this);
    }

    public void startGame() {
        gameLoop.start();
    }

    // Logic game
    public void update() {
        player.update();
    }

    // Vẽ game
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        player.render(g2);
        g2.dispose();
    }
}
