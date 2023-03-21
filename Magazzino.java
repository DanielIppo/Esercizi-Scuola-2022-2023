import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Magazzino extends JFrame {
    public Magazzino(Alimentari[] alimentari, Casalinghi[] casalinghi, Abbigliamento[] abbigliamento){
        super("Magazzino");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Benvenuto nel magazzino, cosa vuoi fare?");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton button1 = new JButton("Aggiungere un nuovo prodotto");
        JButton button2 = new JButton("Rimuoverti un prodotto");
        JButton button3 = new JButton("Stampare tutti i prodotti");
        JButton button4 = new JButton("Stampa degli alimenti con scadenza inferiore a 5 giorni");

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(5, 1));
        panel.add(label);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AggiungiProdotto(alimentari, casalinghi, abbigliamento);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RimuoviProdotto(alimentari, casalinghi, abbigliamento);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
