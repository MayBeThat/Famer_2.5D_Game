package farmgame.environment;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;
public class house  extends EnvironmentObject {
    public house(int x,int y){
        super(x,y);
        scale=1;
        solid=true;
        loadSprite();
    }
    @Override
    protected void loadSprite() {
        sprite = Sprite.load("/Environment/house/House.png");
    }
}
