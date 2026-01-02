package farmgame.environment;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class FullyFence extends EnvironmentObject {

    public FullyFence(int x, int y) {
        super(x, y);
        scale = 0.2;
        solid = true;
        loadSprite();
    }

    @Override
    protected void loadSprite() {
        sprite = Sprite.load("/Environment/fence/fence_0.png");
    }
}
