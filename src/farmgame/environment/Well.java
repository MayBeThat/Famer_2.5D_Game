package farmgame.environment;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;

public class Well extends EnvironmentObject{
    public Well(int x, int y) {
        super(x, y);
        scale = 1;
        solid = true;
        loadSprite();
    }
    @Override
    public void loadSprite(){
        sprite = Sprite.load("/Environment/Well/Well.png");
    }

}
