import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
    public Main(){
        super("Calcolo area");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        JPanel pannello1 = new JPanel();
        JPanel pannello2 = new JPanel();
        pannello1.setLayout(new GridLayout(2, 1));
        pannello2.setLayout(new GridLayout(2, 1));
        JButton triangolo = new JButton("Triangolo");
        JButton rettangolo = new JButton("Rettangolo");
        pannello1.add(triangolo);
        pannello1.add(rettangolo);
        add(pannello1);
        add(pannello2);
        triangolo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pannello2.removeAll();
                pannello2.add(new AreaTriangolo());
                pannello2.revalidate();
                pannello2.repaint();
            }
        });
        rettangolo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pannello2.removeAll();
                pannello2.add(new AreaRettangolo());
                pannello2.revalidate();
                pannello2.repaint();
            }
        });
        setVisible(true);
    }
    public static void main(String[] args){
        new Main();
    }
}