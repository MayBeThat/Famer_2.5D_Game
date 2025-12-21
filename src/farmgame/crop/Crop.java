package farmgame.crop;
import farmgame.entity.Entity;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
public abstract class Crop extends Entity {
    protected int growthStage = 0;
    protected int MaxStage;
    protected BufferedImage[] StageSprite;
    protected boolean water = false;

    public Crop(int x, int y){
        super(x,y);
        loadSprites();
    }
    protected abstract void loadSprites();
    public void Water() {
        water = true;
    }
    public void Grow() {
        if (water && growthStage < MaxStage) {
            growthStage++;
        }
        water = false;
    }
    public boolean isMature() {
        return growthStage == MaxStage;
    }
    @Override
    public void render(Graphics2D g2) {
        if(StageSprite[growthStage] != null){
            g2.drawImage(StageSprite[growthStage], (int) x, (int) y, null);
        }
    }
    @Override
    public void update() {}
}