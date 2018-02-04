import java.awt.EventQueue;
import javax.swing.JFrame;

public class SimpleWindow extends JFrame {

    public SimpleWindow() {

        initUI();
    }

    private void initUI() {
        
        setTitle("A very simple example");
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SimpleWindow ex = new SimpleWindow();
            ex.setVisible(true);
        });
    }
}
