import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu extends JFrame
{
    private JLabel version;
    private Image background;
    private JButton newMatch;
    private JButton newTeam;
    private JButton newPlayer;
    private JButton matchDatabase;
    private GameTable tbl;
    InsertImage bg;
    public Menu()
    {
        setSize(800,599);
        setResizable(false);

        background = new ImageIcon("bckground.jpg").getImage();
        newMatch= new JButton("New Match");
        newTeam = new JButton("New Team");
        newPlayer = new JButton("New Player");
        matchDatabase = new JButton("Match DataBase");
        bg = new InsertImage(background,0,0);
        tbl = new GameTable();
        buttons();
        setPanel(0);
        setLayout(new BorderLayout());

    }

    public void setPanel(int a)
    {
        getContentPane().invalidate();
        switch(a){
            case 0: {setContentPane(bg);break;}
            case 1: {getContentPane().remove(bg);setContentPane(tbl);break;}//newMatch towchin deer darahad hiigdeh uildel
        }

    }

    public void buttons()
    {
        newMatch.setBounds(300,100,200,49);
        newTeam.setBounds(300,150,200,49);
        newPlayer.setBounds(300,200,200,49);
        matchDatabase.setBounds(300,250,200,49);
        newMatch.setBackground(Color.CYAN);
        newTeam.setBackground(Color.CYAN);
        newPlayer.setBackground(Color.CYAN);
        matchDatabase.setBackground(Color.CYAN);
        bg.add(newMatch);
        bg.add(newTeam);
        bg.add(newPlayer);
        bg.add(matchDatabase);
        newMatch.addActionListener(new ActionListener(){ 
                @Override
                public void actionPerformed(ActionEvent e){ 
                    remove(bg);
                    setPanel(1);
                }
            });
        newTeam.addActionListener(new ActionListener(){ 
                @Override
                public void actionPerformed(ActionEvent e){ 
                    JOptionPane.showMessageDialog(null,"ene heseg zaswartai baina.");

                }
            });
        newPlayer.addActionListener(new ActionListener(){ 
                @Override
                public void actionPerformed(ActionEvent e){ 
                    JOptionPane.showMessageDialog(null,"ene heseg zaswartai baina.");
                }
            });
    }
}

