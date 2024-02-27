package config;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MenuOwner extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D grafis = (Graphics2D) g.create();
        Image img = new ImageIcon(getClass().getResource("/images/Menu-Dasboard-Owner.png")).getImage();
        grafis.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        grafis.dispose();
    }
}
