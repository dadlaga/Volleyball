import java.awt.*;
import javax.swing.*;

public class Main extends JFrame
{
    private JPanel mva;
    public static void main()
    {
        new Main().setVisible(true);
    }

    public void Main()
    {
        JLabel homeTeam = new JLabel("HomeTeam");
        homeTeam.setSize(10,50);
        setSize(800,500);
        JLabel GuestTeam = new JLabel("GuestTeam");
        JButton homeScored = new JButton("+1");
        homeScored.setSize(10,50);
        JTextField name1 = new JTextField("insert name");
        add(homeTeam);
        add(homeScored);
    }
}
