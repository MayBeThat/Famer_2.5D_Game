package farmgame.crop;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class Tomato extends Crop {

    public Tomato(int x, int y) {
        super(x, y);
        scale = 0.24;
        MaxStage = 3;
    }

    @Override
    protected void loadSprites() {
        StageSprite = new BufferedImage[3];
        StageSprite[0] = Sprite.load("/crops/Tomato/stage0.png");
        StageSprite[1] = Sprite.load("/crops/Tomato/stage1.png");
        StageSprite[2] = Sprite.load("/crops/Tomato/stage2.png");
    }
}
