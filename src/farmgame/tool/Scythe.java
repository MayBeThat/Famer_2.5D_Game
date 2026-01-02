package farmgame.tool;

import farmgame.entity.Player;
import farmgame.world.Tile;
import farmgame.crop.Crop;

public class Scythe extends Tool {

    public Scythe() {
        super("Scythe");
    }

    @Override
    public void use(Player player, Tile tile) {

        if (tile == null) return;

        Crop crop = tile.getCrop();

        if (crop != null && crop.isMature()) {
            player.addItem(crop.getHarvestItem());
            tile.removeCrop();
        }
    }
}