package farmgame.environment;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Rock extends EnvironmentObject {

    private static BufferedImage[] ROCK_SPRITES;
    private static final Random rand = new Random();

    public Rock(int x, int y) {
        super(x, y);
        scale = 1.0;
        solid = true;
        loadSprite();
    }

    @Override
    protected void loadSprite() {
        if (ROCK_SPRITES == null) {
            ROCK_SPRITES = new BufferedImage[3];
            ROCK_SPRITES[0] = Sprite.load("/Environment/rocks/Rock_0.png");
            ROCK_SPRITES[1] = Sprite.load("/Environment/rocks/Rock_1.png");
            ROCK_SPRITES[2] = Sprite.load("/Environment/rocks/Rock_2.png");
        }

        int variant = rand.nextInt(ROCK_SPRITES.length);
        sprite = ROCK_SPRITES[variant];
    }
}
