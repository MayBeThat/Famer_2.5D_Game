package farmgame.tool;

import farmgame.entity.Player;
import farmgame.world.Tile;
import farmgame.crop.Crop;

public class WateringCan extends Tool {

    public WateringCan() {
        super("Watering Can");
    }

    @Override
    public void use(Player player, Tile tile) {

        if (tile == null) return;

        Crop crop = tile.getCrop();

        if (crop != null) {
            crop.water();
        }
    }
}