package farmgame.crop;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class Carrot extends Crop {

    public Carrot(int x, int y) {
        super(x, y);
        scale = 1.7;
        MaxStage = 3;
    }

    @Override
    protected void loadSprites() {
        StageSprite = new BufferedImage[3];
        StageSprite[0] = Sprite.load("/crops/carrot/stage0.png");
        StageSprite[1] = Sprite.load("/crops/carrot/stage1.png");
        StageSprite[2] = Sprite.load("/crops/carrot/stage2.png");
    }
}
