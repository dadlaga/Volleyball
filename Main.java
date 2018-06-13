import java.awt.*;
import javax.swing.*;

public class Main extends JFrame
{
    private JLabel version;
    private Image background;
    private ImagePanel pan;
    private JButton newMatch;
    private JButton newTeam;
    private JButton newPlayer;
    private JButton matchDatabase;
    public static void main()
    {
        Main l = new Main();
        l.setSize(815,637);
        l.setVisible(true);
        l.setTitle("MVA");
        l.setLayout(null);
    }

    public Main()
    {

        background = new ImageIcon(getClass().getResource("bckground.jpg")).getImage();
        newMatch= new JButton("New Match");
        newTeam = new JButton("New Team");
        newPlayer = new JButton("New Player");
        matchDatabase = new JButton("Match DataBase");
        version = new JLabel("1.0");
        pan = new ImagePanel(background);
        watch();
    }

    public void watch()
    {
        setContentPane(pan);
        newMatch.setBounds(300,100,200,49);
        newTeam.setBounds(300,150,200,49);
        newPlayer.setBounds(300,200,200,49);
        matchDatabase.setBounds(300,250,200,49);
        version.setBounds(20,20,20,20);
        add(newMatch);
        add(newTeam);
        add(newPlayer);
        add(matchDatabase);
        add(version);
    }
}
