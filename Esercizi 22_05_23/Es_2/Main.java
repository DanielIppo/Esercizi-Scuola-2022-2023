//Implementare un programma che dato un numero, collocato in un JTextField e dotato di due pulsanti Incrementa e Decrementa, permetta l'incremento o il decremento di 1 di quel numero.
//Il programma deve essere dotato di un'interfaccia grafica che permetta di visualizzare il numero e di interagire con i pulsanti

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton incrementa;
    private JButton decrementa;
    private int numero;

    public Main() {
        super("Incrementa/Decrementa");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        textField = new JTextField(10);
        incrementa = new JButton("Incrementa");
        decrementa = new JButton("Decrementa");
        add(textField);
        add(incrementa);
        add(decrementa);
        incrementa.addActionListener(this);
        decrementa.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementa) {
            numero = Integer.parseInt(textField.getText());
            numero++;
            textField.setText(String.valueOf(numero));
        } else if (e.getSource() == decrementa) {
            numero = Integer.parseInt(textField.getText());
            numero--;
            textField.setText(String.valueOf(numero));
        }
    }
}