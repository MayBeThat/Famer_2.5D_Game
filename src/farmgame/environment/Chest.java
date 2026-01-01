package farmgame.environment;

import farmgame.entity.Player;
import farmgame.graphics.Sprite;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Chest extends EnvironmentObject {

    private boolean opened = false;

    private BufferedImage closedSprite;
    private BufferedImage openedSprite;

    public Chest(int x, int y) {
        super(x, y);
        scale = 0.5;
        solid = true;
    }

    @Override
    protected void loadSprite() {
        closedSprite = Sprite.load("/Environment/chest/close.png");
        openedSprite = Sprite.load("/Environment/chest/open.png");
        sprite = closedSprite;
    }

    public void interact(Player player) {
        if (isNearPlayer(player)) {
            toggle();
        }
    }


    private void toggle() {
        opened = !opened;
        sprite = opened ? openedSprite : closedSprite;
    }

}
