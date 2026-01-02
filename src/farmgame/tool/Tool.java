package farmgame.tool;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import farmgame.entity.Player;
import farmgame.world.Tile;

public abstract class Tool {

    protected String name;
    protected BufferedImage icon;

    public Tool(String name) {
        this.name = name;
    }

    // Hành động chính của tool
    public abstract void use(Player player, Tile targetTile);

    // Vẽ icon tool (dùng cho UI sau này)
    public void drawIcon(Graphics2D g2, int x, int y) {
        if (icon != null) {
            g2.drawImage(icon, x, y, null);
        }
    }

    public String getName() {
        return name;
    }
}