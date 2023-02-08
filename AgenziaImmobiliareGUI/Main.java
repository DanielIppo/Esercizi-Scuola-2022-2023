/* 
La famiglia Rossi ha a disposizione una somma di denaro da investire e vuole valutare su quale tipo di investimento indirizzarsi tenuto conto che: 
    Vuole differenziare l’investimento nei seguenti 3 prodotti finanziari. 
 
    —------------------------------------------------------------------------------------------------------------- 
    | Codice Prodotto |     Investimento                   |  %Reddito annuo  |  Rate Risk  |  Indice Rischio    | 
    —------------------------------------------------------------------------------------------------------------- 
    | PiA             | Piano di Investimento Assicurativo | 1.5%        | 3      |               | 
    -------------------------------------------------------------------------------------------------------------- 
    | BTC             | BitCoin                            | 2.80%            | 7           |                    | 
    -------------------------------------------------------------------------------------------------------------- 
    | Fiv             | Fondi di Investimento              | 1.7%             | 2           |                    | 
    -------------------------------------------------------------------------------------------------------------- 
 
 
Realizzare un algoritmo che permetta di: 
    1) Dare in input la somma da investire;  
    2) Distribuisca in maniera Random l’importo dato input nei tre tipi di finanziamento con un 
        minimo di 2000€ per ogni investimento; 
    3) Calcoli il rendimento annuo maturato per ogni prodotto di investimento; 
    4) Calcoli la somma dei tre rendimenti; 
    5) Calcolare l'indice di rischio totale che deve essere compreso tra 200 e 600;
    6) Calcoli l’indice del rischio per ogni prodotto finanziario così calcolato: 
        Rendimento*Rate Risk/%Rendimento annuo;
    8) Confronti che il totale degli indici di rischio rientri nel Range 200<>600; 
    9) Il ciclo si conclude dopo che verranno visualizzate 3 ipotesi valide.   
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private JTextField inpuTextField;

    public Main() {
        super("Agenzia Finanziaria - Inserimento Soldi");
        setSize(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel);
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel(
                "Inserisci il valore da aggiungere. L'importo minimo deve essere di 2000€ e massimo 100000€");
        panel.add(label);
        inpuTextField = new JTextField(10);
        panel.add(inpuTextField);
        JButton button = new JButton("Aggiungi");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inpuTextField.getText());
                    if (value >= 2000 && value <= 100000) {
                        new CalcoloRendimento(value);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "L'importo minimo deve essere di 2000€ e massimo 100000€");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Inserisci un valore numerico");
                }
            }
        });
        panel.add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
