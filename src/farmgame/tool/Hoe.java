package farmgame.tool;

import farmgame.entity.Player;
import farmgame.world.Tile;

public class Hoe extends Tool {

    public Hoe() {
        super("Hoe");
    }

    @Override
    public void use(Player player, Tile tile) {

        if (tile == null) return;

        if (!tile.isTilled() && tile.isSoil()) {
            tile.till();
        }
    }
}