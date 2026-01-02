package farmgame.crop;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class Sunflower extends Crop {

    public Sunflower(int x, int y) {
        super(x, y);
        scale = 1.5;
        MaxStage = 3;
    }

    @Override
    protected void loadSprites() {
        StageSprite = new BufferedImage[3];
        StageSprite[0] = Sprite.load("/crops/Sunflower/stage0.png");
        StageSprite[1] = Sprite.load("/crops/Sunflower/stage1.png");
        StageSprite[2] = Sprite.load("/crops/Sunflower/stage2.png");
    }
}
