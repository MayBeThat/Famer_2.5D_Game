package farmgame.environment;

import farmgame.entity.Entity;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class EnvironmentObject extends Entity {

    protected boolean solid;
    public EnvironmentObject(int x, int y) {
        super(x, y);
        loadSprite();
    }

    protected abstract void loadSprite();

    public boolean isSolid() {
        return solid;
    }

    @Override
    public void update() {
    }
}
