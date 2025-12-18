package farmgame.engine;

public class GameLoop implements Runnable {

    private final int FPS = 60;   // Game chạy 60 lần / giây
    private Thread gameThread;
    private GamePanel gamePanel;

    public GameLoop(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    // Hàm bắt đầu loop
    public void start() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000.0 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();

        while (gameThread != null) {

            long currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            // Khi đủ thời gian cho 1 frame
            if (delta >= 1) {
                gamePanel.update();   // Cập nhật logic
                gamePanel.repaint(); // Vẽ lại màn hình
                delta--;
            }
        }
    }
}
