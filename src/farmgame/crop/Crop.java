package farmgame.crop;

import farmgame.item.Item;
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
    private Item harvestItem;

    public Crop(int x, int y){
        super(x, y);
        loadSprites();
        sprite = StageSprite[growthStage];
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
}