package farmgame.main;

import farmgame.engine.GamePanel;
import javax.swing.JFrame;

public class GameLauncher {

    public static void main(String[] args) {

        // 1. Tạo cửa sổ
        JFrame window = new JFrame("Farmer 2.5D Game");

        // 2. Tạo GamePanel (nơi vẽ game)
        GamePanel gamePanel = new GamePanel();

        // 3. Gắn GamePanel vào cửa sổ
        window.add(gamePanel);

        // 4. Tự điều chỉnh kích thước theo GamePanel
        window.pack();

        // 5. Đóng game khi bấm X
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 6. Hiện cửa sổ ra giữa màn hình
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        // 7. BẮT ĐẦU GAME LOOP
        gamePanel.startGame();
    }
}
