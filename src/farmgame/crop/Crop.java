package farmgame.crop;

import farmgame.item.Item;

/*public class Crop {

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

    // dùng tool

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
*/
        
import farmgame.entity.Entity;
import farmgame.entity.Player;
import farmgame.graphics.Sprite;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
public abstract class Crop extends Entity {
    protected int growthStage = 0;
    protected int MaxStage;
    protected BufferedImage[] StageSprite;
    protected boolean water = false;
    private boolean watered;
    private Item harvestItem;

    public Crop(int x, int y){
        super(x, y);
        loadSprites();
        sprite = StageSprite[growthStage];
        this.harvestItem = harvestItem;
        this.watered = false;
    }
    protected abstract void loadSprites();
    public void Water() {
        water = true;
    }
    public void Grow() {
        if (water && growthStage < MaxStage - 1) {
            growthStage++;
        }
        water = false;
    }
    public boolean isMature() {
        return growthStage == MaxStage - 1;
    }
    @Override
    public void update() {
        sprite = StageSprite[growthStage];
    }

    // phần tôi (Minh) thêm từ code tôi 
    public Item getHarvestItem() {
        return harvestItem;
    }
    public void water() {
        watered = true;
    }
}