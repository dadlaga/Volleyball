import java.awt.*;
import javax.swing.*;
public class ImagePanel extends JPanel{
    Image image;
    public ImagePanel(Image image){
        this.image = image;
        setLayout(new BorderLayout());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0,0, this);
    }
}