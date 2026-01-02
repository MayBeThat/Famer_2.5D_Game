package farmgame.crop;

import farmgame.item.Item;

public class Crop {

    private int growthStage;
    private int maxGrowthStage;
    private boolean watered;
    private Item harvestItem;

    public Crop(Item harvestItem) {
        this.harvestItem = harvestItem;
        this.growthStage = 0;
        this.maxGrowthStage = 3;
        this.watered = false;
    }

    // ====== TOOL dùng ======

    public void water() {
        watered = true;
    }

    public void grow() {
        if (watered && growthStage < maxGrowthStage) {
            growthStage++;
            watered = false;
        }
    }

    public boolean isMature() {
        return growthStage >= maxGrowthStage;
    }

    public Item getHarvestItem() {
        return harvestItem;
    }
}