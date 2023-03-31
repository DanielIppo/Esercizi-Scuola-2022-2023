import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AreaTriangolo extends JFrame{
    public AreaTriangolo(){
        super("Calcolo area triangolo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        JPanel pannello1 = new JPanel();
        JPanel pannello2 = new JPanel();
        pannello1.setLayout(new GridLayout(2, 1));
        pannello2.setLayout(new GridLayout(2, 1));
        JLabel lato1 = new JLabel("Lato 1");
        JLabel lato2 = new JLabel("Lato 2");
        JTextField lato1Text = new JTextField();
        JTextField lato2Text = new JTextField();
        JButton calcola = new JButton("Calcola");
        pannello1.add(lato1);
        pannello1.add(lato1Text);
        pannello1.add(lato2);
        pannello1.add(lato2Text);
        pannello2.add(calcola);
        add(pannello1);
        add(pannello2);
        calcola.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int lato1 = Integer.parseInt(lato1Text.getText());
                int lato2 = Integer.parseInt(lato2Text.getText());
                int area = (lato1 * lato2) / 2;
                JOptionPane.showMessageDialog(null, "L'area del triangolo è: " + area);
            }
        });
        setVisible(true);
    }
}