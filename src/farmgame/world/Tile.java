package farmgame.world;

import farmgame.crop.Crop;

public class Tile {

    private boolean soil;     // có phải đất trồng không
    private boolean tilled;   // đã cuốc chưa
    private Crop crop;        // cây trồng trên ô

    public Tile(boolean soil) {
        this.soil = soil;
        this.tilled = false;
        this.crop = null;
    }

    // ====== TOOL dùng ======

    public boolean isSoil() {
        return soil;
    }

    public boolean isTilled() {
        return tilled;
    }

    public void till() {
        if (soil) {
            tilled = true;
        }
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public void removeCrop() {
        this.crop = null;
        this.tilled = false; // sau khi thu hoạch, đất trở lại bình thường
    }
}