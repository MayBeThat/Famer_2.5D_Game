package farmgame.entity;

import farmgame.input.InputHandler;
import java.awt.*;

public class Player extends Entity {

    private InputHandler input;

    public Player(InputHandler input) {
        this.input = input;

        x = 100;
        y = 100;
        width = 32;
        height = 48;
        speed = 4;
    }

    @Override
    public void update() {
        if (input.up) y -= speed;
        if (input.down) y += speed;
        if (input.left) x -= speed;
        if (input.right) x += speed;
    }

    @Override
    public void render(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.fillRect(x, y, width, height);
    }
}
