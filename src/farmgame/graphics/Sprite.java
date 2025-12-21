package farmgame.graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Sprite {

    public static BufferedImage load(String path) {
        try {
            return ImageIO.read(Sprite.class.getResource(path));
        } catch (IOException e) {
            System.out.println("Failed to load sprite: " + path);
            return null;
        }
    }
}
