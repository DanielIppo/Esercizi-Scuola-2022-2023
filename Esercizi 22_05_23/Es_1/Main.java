import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    private JLabel lblNum, lblRad, lblQuad;
    private JTextField txtNum, txtRad, txtQuad;
    private JButton btnCalcola;

    public Main() {
        super("Calcolo radice e quadrato");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        lblNum = new JLabel("Numero");
        lblRad = new JLabel("Radice");
        lblQuad = new JLabel("Quadrato");
        txtNum = new JTextField();
        txtRad = new JTextField();
        txtRad.setEditable(false);
        txtQuad = new JTextField();
        txtQuad.setEditable(false);
        btnCalcola = new JButton("Calcola");

        add(lblNum);
        add(txtNum);
        add(lblRad);
        add(txtRad);
        add(lblQuad);
        add(txtQuad);
        add(btnCalcola);

        btnCalcola.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(txtNum.getText());
        txtRad.setText("" + Math.sqrt(num));
        txtQuad.setText("" + Math.pow(num, 2));
    }

    public static void main(String[] args) {
        new Main();
    }
}