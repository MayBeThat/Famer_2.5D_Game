package farmgame.entity;

import farmgame.input.InputHandler;
import farmgame.item.Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player extends Entity {

    private InputHandler input;
    private List<Item> inventory;

    public Player(InputHandler input) {
        super(100,100);
        this.input = input;
        this.inventory = new ArrayList<>();

        width = 32;
        height = 48;
        speed = 4;
    }

    @Override
    public void update() {
        if (input.up) y -= speed;
        if (input.down) y += speed;
        if (input.left) x -= speed;
        if (input.right) x += speed;
    }

    @Override
    public void render(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.fillRect(x, y, width, height);
    }

    public void addItem(Item item) {
        if (item != null) {
            inventory.add(item);
        }
    }

    public List<Item> getInventory() {
        return inventory;
    }
}

