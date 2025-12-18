package farmgame.entity;

import java.awt.Graphics2D;

public abstract class Entity {

    protected int x, y;
    protected int width, height;
    protected int speed;

    public abstract void update();
    public abstract void render(Graphics2D g2);
}
