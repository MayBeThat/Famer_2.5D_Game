package farmgame.crop;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class Potato extends Crop {

    public Potato(int x, int y) {
        super(x, y);
        MaxStage = 2;
    }

    @Override
    protected void loadSprites() {
        StageSprite = new BufferedImage[4];
        StageSprite[0] = Sprite.load("/crops/potato/stage_0.png");
        StageSprite[1] = Sprite.load("/crops/potato/stage_1.png");
        StageSprite[2] = Sprite.load("/crops/potato/stage_2.png");
        StageSprite[3] = Sprite.load("/crops/potato/stage_3.png");
    }
}
