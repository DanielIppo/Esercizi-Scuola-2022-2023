import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RimuoviProdotto {
    private JTextField inputCodiceFornitore;
    public RimuoviProdotto(Alimentari[] alimentari, Casalinghi[] casalinghi, Abbigliamento[] abbigliamento){
        JFrame rimuoviProdotto = new JFrame("Rimuovi prodotto");
        rimuoviProdotto.setSize(600, 250);
        rimuoviProdotto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rimuoviProdotto.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        rimuoviProdotto.add(panel);
        panel.setLayout(new GridLayout(2, 1));
        
        JLabel label = new JLabel("Inserisci il codice del fornitore del prodotto che vuoi rimuovere");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        inputCodiceFornitore = new JTextField(10);
        JButton button = new JButton("Conferma");
        panel.add(label);
        panel.add(inputCodiceFornitore);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String codiceFornitore = inputCodiceFornitore.getText();
                for(int i = 0; i < alimentari.length; i++){
                    if(alimentari[i] != null){
                        if(alimentari[i].getCodiceFornitore().equals(codiceFornitore)){
                            alimentari[i] = null;
                            rimuoviProdotto.dispose();
                            rimuoviProdotto.setVisible(false);
                        }
                    }
                }
                for(int i = 0; i < casalinghi.length; i++){
                    if(casalinghi[i] != null){
                        if(casalinghi[i].getCodiceFornitore().equals(codiceFornitore)){
                            casalinghi[i] = null;
                            rimuoviProdotto.dispose();
                            rimuoviProdotto.setVisible(false);
                        }
                    }
                }
                for(int i = 0; i < abbigliamento.length; i++){
                    if(abbigliamento[i] != null){
                        if(abbigliamento[i].getCodiceFornitore().equals(codiceFornitore)){
                            abbigliamento[i] = null;
                            rimuoviProdotto.dispose();
                            rimuoviProdotto.setVisible(false);
                        }
                    }
                }
            }
        });
        
        rimuoviProdotto.setVisible(true);
    }
}
