// Author  : Ahmed Jemal Anwar
// ID e200132
// Space fight 2D Game
package fighter;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Collision extends JFrame {

    public Collision() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Space_Fighter");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Collision start = new Collision();
            start.setVisible(true);
        });
    }
}