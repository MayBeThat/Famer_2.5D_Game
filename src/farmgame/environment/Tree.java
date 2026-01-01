package farmgame.environment;

import farmgame.graphics.Sprite;
import java.awt.image.BufferedImage;
public class Tree  extends EnvironmentObject {
    protected int variant = 0;
    protected static BufferedImage[] TreeTypes;
    public Tree (int x,int y,int variant){
        super(x,y);
        scale=1;
        solid=true;
        this.variant = variant;
        loadSprite();
    }
    @Override
    protected void loadSprite() {
        TreeTypes = new BufferedImage[13];
        TreeTypes[0] = Sprite.load("/Environment/tree/Tree_0.png"); //normal
        TreeTypes[1] = Sprite.load("/Environment/tree/Tree_1.png"); //normal
        TreeTypes[2] = Sprite.load("/Environment/tree/Tree_2.png"); //normal
        TreeTypes[3] = Sprite.load("/Environment/tree/Tree_3.png"); //normal
        TreeTypes[4] = Sprite.load("/Environment/tree/Fruit_tree1.png"); //fruit_tree
        TreeTypes[5] = Sprite.load("/Environment/tree/Palm_tree1.png");   // palm
        TreeTypes[6] = Sprite.load("/Environment/tree/Palm_tree2.png");   // palm
        TreeTypes[7] = Sprite.load("/Environment/tree/Palm_tree3.png");   // palm
        TreeTypes[8] = Sprite.load("/Environment/tree/Palm_tree4.png");   // palm
        TreeTypes[9] = Sprite.load("/Environment/tree/Christmas_tree1.png");    //xmax tree
        TreeTypes[10] = Sprite.load("/Environment/tree/Christmas_tree2.png");   //xmax tree
        TreeTypes[11] = Sprite.load("/Environment/tree/Broken_tree1.png");      //broken tree
        TreeTypes[12] = Sprite.load("/Environment/tree/Broken_tree2.png");      //broken tree
    sprite = TreeTypes[variant];
    }

}
