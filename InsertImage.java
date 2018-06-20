import javax.swing.JPanel;
import java.awt.*;
public class InsertImage extends JPanel
{
    private int width;
    private int height;
   private Image image;
    public InsertImage(Image image,int x,int y) {
        this.image = image;
        this.width = x;
        this.height = y;
        setLayout(new FlowLayout());
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, width, height, this);
    }
}
