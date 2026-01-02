package farmgame.entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Entity {

    protected BufferedImage sprite;
    protected double scale = 1.0;
    protected int x, y;
    protected int width, height;
    protected int speed;

    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public boolean isNearPlayer(Player player) {
        int thisCenterX = x + 24;
        int thisCenterY = y + 24;
        int playerCenterX = player.getX() + 24;
        int playerCenterY = player.getY() + 24;

        int range = 48;
        return Math.abs(thisCenterX - playerCenterX) <= range &&
                Math.abs(thisCenterY - playerCenterY) <= range;
    }

    public abstract void update();

    public void render(Graphics2D g2) {
        if (sprite == null) return;

        int width = (int) (sprite.getWidth() * scale);
        int height = (int) (sprite.getHeight() * scale);

        int drawX = x + (48 - width) / 2;
        int drawY = y + 48 - height;

        g2.drawImage(sprite, drawX, drawY, width, height, null);
    }
}
