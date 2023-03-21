import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AggiungiProdotto {
    private JTextField inputCodiceFornitore, inputScortaMinima, inputQuantita, inputDescrizione, inputPrezzoUnitario, inputDataScadenza, inputTipo, inputTaglia, inputColore;
    public AggiungiProdotto(Alimentari[] alimentari, Casalinghi[] casalinghi, Abbigliamento[] abbigliamento){
        JFrame aggiungiProdotto = new JFrame("Aggiungi Prodotto");
        aggiungiProdotto.setSize(400, 250);
        aggiungiProdotto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aggiungiProdotto.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        aggiungiProdotto.add(panel);
        panel.setLayout(new GridLayout(1, 5));

        JLabel label = new JLabel("Che tipo di prodotto vuoi aggiungere?");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        aggiungiProdotto.add(label);

        Button button1 = new Button("Alimentare");
        Button button2 = new Button("Casalinghi");
        Button button3 = new Button("Abbigliamento");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);

                aggiungiProdotto.setSize(400, 800);
                panel.setLayout(new GridLayout(100, 2));

                JLabel codiceFornitore = new JLabel("Inserisci il codice Fornitore: ");
                codiceFornitore.add(label);
                inputCodiceFornitore = new JTextField(10);
                panel.add(codiceFornitore);
                panel.add(inputCodiceFornitore);

                JLabel scortaMinima = new JLabel("Inserisci la scorta minima: ");
                scortaMinima.add(label);
                inputScortaMinima = new JTextField(10);
                panel.add(scortaMinima);
                panel.add(inputScortaMinima);

                JLabel quantita = new JLabel("Inserisci la quantità: ");
                quantita.add(label);
                inputQuantita = new JTextField(10);
                panel.add(quantita);
                panel.add(inputQuantita);

                JLabel descrizione = new JLabel("Inserisci la descrizione: ");
                descrizione.add(label);
                inputDescrizione = new JTextField(10);
                panel.add(descrizione);
                panel.add(inputDescrizione);

                JLabel prezzo = new JLabel("Inserisci il prezzo: ");
                prezzo.add(label);
                inputPrezzoUnitario = new JTextField(10);
                panel.add(prezzo);
                panel.add(inputPrezzoUnitario);

                JLabel scadenza = new JLabel("Inserisci la scadenza (dd/mm/yyyy): ");
                scadenza.add(label);
                inputDataScadenza = new JTextField(10);
                panel.add(scadenza);
                panel.add(inputDataScadenza);

                JLabel lattosio = new JLabel("Contiene il lattosio? ");
                lattosio.add(label);
                JCheckBox lattosioSi = new JCheckBox("Si");
                JCheckBox lattosioNo = new JCheckBox("No");
                panel.add(lattosio);
                panel.add(lattosioSi);
                panel.add(lattosioNo);

                JLabel glutine = new JLabel("Contiene il glutine? ");
                glutine.add(label);
                JCheckBox glutineSi = new JCheckBox("Si");
                JCheckBox glutineNo = new JCheckBox("No");
                panel.add(glutine);
                panel.add(glutineSi);
                panel.add(glutineNo);

                JButton conferma = new JButton("Conferma");
                panel.add(conferma);

                conferma.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int length = alimentari.length;
                        alimentari[length-1] = new Alimentari(inputCodiceFornitore.getText(), Integer.parseInt(inputQuantita.getText()), Integer.parseInt(inputScortaMinima.getText()), inputDescrizione.getText(), Double.parseDouble(inputPrezzoUnitario.getText()), inputDataScadenza.getText(), lattosioSi.isSelected(), glutineSi.isSelected());
                        aggiungiProdotto.setVisible(false);
                    }
                });

            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);

                panel.setLayout(new GridLayout(2, 2));
                aggiungiProdotto.setSize(600, 300);

                JLabel codiceFornitore = new JLabel("Inserisci il codice Fornitore: ");
                codiceFornitore.add(label);
                inputCodiceFornitore = new JTextField(10);
                panel.add(codiceFornitore);
                panel.add(inputCodiceFornitore);

                JLabel scortaMinima = new JLabel("Inserisci la scorta minima: ");
                scortaMinima.add(label);
                inputScortaMinima = new JTextField(10);
                panel.add(scortaMinima);
                panel.add(inputScortaMinima);

                JLabel quantita = new JLabel("Inserisci la quantità: ");
                quantita.add(label);
                inputQuantita = new JTextField(10);
                panel.add(quantita);
                panel.add(inputQuantita);

                JLabel descrizione = new JLabel("Inserisci la descrizione: ");
                descrizione.add(label);
                inputDescrizione = new JTextField(10);
                panel.add(descrizione);
                panel.add(inputDescrizione);

                JLabel prezzo = new JLabel("Inserisci il prezzo: ");
                prezzo.add(label);
                inputPrezzoUnitario = new JTextField(10);
                panel.add(prezzo);
                panel.add(inputPrezzoUnitario);

                JLabel scadenza = new JLabel("Inserisci la scadenza: ");
                scadenza.add(label);
                inputDataScadenza = new JTextField(10);
                panel.add(scadenza);
                panel.add(inputDataScadenza);

                JLabel tipo = new JLabel("Inserisci il tipo (Liquido, Polvere, Solido): ");
                tipo.add(label);
                inputTipo = new JTextField(10);
                panel.add(tipo);
                panel.add(inputTipo);

                JButton conferma = new JButton("Conferma");
                panel.add(conferma);

                conferma.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int length = casalinghi.length;
                        casalinghi[length-1] = new Casalinghi(inputCodiceFornitore.getText(), Integer.parseInt(inputQuantita.getText()), Integer.parseInt(inputScortaMinima.getText()), inputDescrizione.getText(), Double.parseDouble(inputPrezzoUnitario.getText()), inputTipo.getText());
                        aggiungiProdotto.setVisible(false);
                    }
                });
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);

                panel.setLayout(new GridLayout(2, 2));
                aggiungiProdotto.setSize(600, 300);

                JLabel codiceFornitore = new JLabel("Inserisci il codice Fornitore: ");
                codiceFornitore.add(label);
                inputCodiceFornitore = new JTextField(10);
                panel.add(codiceFornitore);
                panel.add(inputCodiceFornitore);

                JLabel scortaMinima = new JLabel("Inserisci la scorta minima: ");
                scortaMinima.add(label);
                inputScortaMinima = new JTextField(10);
                panel.add(scortaMinima);
                panel.add(inputScortaMinima);

                JLabel quantita = new JLabel("Inserisci la quantità: ");
                quantita.add(label);
                inputQuantita = new JTextField(10);
                panel.add(quantita);
                panel.add(inputQuantita);

                JLabel descrizione = new JLabel("Inserisci la descrizione: ");
                descrizione.add(label);
                inputDescrizione = new JTextField(10);
                panel.add(descrizione);
                panel.add(inputDescrizione);

                JLabel prezzo = new JLabel("Inserisci il prezzo: ");
                prezzo.add(label);
                inputPrezzoUnitario = new JTextField(10);
                panel.add(prezzo);
                panel.add(inputPrezzoUnitario);

                JLabel taglia = new JLabel("Inserisci la taglia (20-90): ");
                taglia.add(label);
                inputTaglia = new JTextField(10);
                panel.add(taglia);
                panel.add(inputTaglia);

                JLabel colore = new JLabel("Inserisci il colore (Nero, Bianco, Rosso, Verde, Blu, Giallo, Arancione, Viola, Grigio, Marrone, Rosa): ");
                colore.add(label);
                inputColore = new JTextField(10);
                panel.add(colore);
                panel.add(inputColore);

                JLabel tipo = new JLabel("Inserisci il tipo (Maglietta, Pantaloni, Giacca, Scarpe, Cappello, Cintura, Cravatta, Calzini): ");
                tipo.add(label);
                inputTipo = new JTextField(10);
                panel.add(tipo);
                panel.add(inputTipo);

                JButton conferma = new JButton("Conferma");
                panel.add(conferma);

                conferma.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int length = abbigliamento.length;
                        abbigliamento[length-1] = new Abbigliamento(inputCodiceFornitore.getText(), Integer.parseInt(inputQuantita.getText()), Integer.parseInt(inputScortaMinima.getText()), inputDescrizione.getText(), Double.parseDouble(inputPrezzoUnitario.getText()), Integer.parseInt(inputTaglia.getText()), inputColore.getText(), inputTipo.getText());
                        aggiungiProdotto.setVisible(false);
                    }
                });
            }
        });

        aggiungiProdotto.setVisible(true);
    }
}
