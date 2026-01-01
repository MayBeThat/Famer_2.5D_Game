package farmgame.crop;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class Wheat extends Crop {
    public Wheat(int x, int y){
        super(x,y);
        MaxStage = 2;
    }
    @Override
    public void loadSprites() {
        StageSprite = new BufferedImage[4];
        StageSprite[0] = Sprite.load("/res/wheat/stage_0.png");
        StageSprite[1] = Sprite.load("/res/wheat/stage_1.png");
        StageSprite[2] = Sprite.load("/res/wheat/stage_2.png");
        StageSprite[3] = Sprite.load("/res/wheat/stage_3.png");

    }

}
