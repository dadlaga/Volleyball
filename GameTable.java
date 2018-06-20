import java.awt.*;
import javax.swing.*;
public class GameTable extends JPanel
{
    private JButton homeScored;
    private JButton guestScored;
    Image homeLogo;
    Image guestLogo;
    public GameTable()
    {
        setLayout(new BorderLayout());
        homeLogo = new ImageIcon("76ers.jpg").getImage();
        guestLogo = new ImageIcon("76.jpg").getImage();
        
    }

    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawImage(homeLogo, 10,10, this);
        g.drawImage(guestLogo, 690,10, this);
    }
}
