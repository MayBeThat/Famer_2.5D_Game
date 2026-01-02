package farmgame.environment;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class Fence extends EnvironmentObject {
    protected int variant = 0;
    protected BufferedImage[] FENCE_SPRITES;
    public Fence(int x, int y, int variant) {
        super(x, y);
        scale = 0.5;
        solid = true;
        this.variant = variant;
        loadSprite();
    }

    @Override
    protected void loadSprite() {
        FENCE_SPRITES = new BufferedImage[6];
        FENCE_SPRITES[0] = Sprite.load("/Environment/fence/Fence_1.png");
        FENCE_SPRITES[1] = Sprite.load("/Environment/fence/Fence_2.png");
        FENCE_SPRITES[2] = Sprite.load("/Environment/fence/Fence_3.png");
        FENCE_SPRITES[3] = Sprite.load("/Environment/fence/Fence_4.png");
        FENCE_SPRITES[4] = Sprite.load("/Environment/fence/Fence_left.png");
        FENCE_SPRITES[5] = Sprite.load("/Environment/fence/Fence_right.png");
        sprite = FENCE_SPRITES[variant];

    }
}
