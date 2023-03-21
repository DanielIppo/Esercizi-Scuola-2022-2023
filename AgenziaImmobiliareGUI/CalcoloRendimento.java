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
import java.util.Random;

public class CalcoloRendimento extends JFrame {
    private double soldiDistribuiti[][] = new double[3][3];
    private double soldiRendimento[][] = new double[3][3];
    private double soldiRendimentoAnnuo[] = { 1.5, 2.8, 1.7 };
    private double soldiRateRisk[] = { 3.0, 7.0, 2.0 };
    private String soldiCodiceProdotto[] = { "PiA", "BTC", "Fiv" };

    public CalcoloRendimento(int value) {
        distributoreSoldi(value);

        String[][] dati = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dati[i][j] = String.valueOf(soldiDistribuiti[i][j]);
            }
        }
        setSize(400, 150);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTable table = new JTable(dati, soldiCodiceProdotto);
        JScrollPane panel = new JScrollPane(table);
        add(panel);
    }

    private void distributoreSoldi(int value) {
        Random random = new Random();

        if (value == 6000) {
            for (int i = 0; i < 3; i++) {
                soldiDistribuiti[i][0] = 2000;
                soldiDistribuiti[i][1] = 2000;
                soldiDistribuiti[i][2] = 2000;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                int soldiTMP = value - 6000;
                double rateRisk = 0;

                for (int j = 0; j < 3; j++) {
                    if (soldiTMP == 0) {
                        break;
                    }
                    soldiDistribuiti[i][j] = Math.round((random.nextDouble() * soldiTMP) * 100) / 100;
                    soldiRendimento[i][j] = Math.round((soldiDistribuiti[i][j] + soldiDistribuiti[i][j] / 100 * soldiRendimentoAnnuo[j]) * 100)/ 100;
                    soldiTMP -= (soldiDistribuiti[i][j] * 100) / 100;
                    soldiDistribuiti[i][j] += 2000;
                }

                for (int j = 0; j < 3; j++) {
                    rateRisk += soldiRendimento[i][j] * soldiRateRisk[j] / soldiRendimentoAnnuo[j];
                }
                if (rateRisk < 200 || rateRisk > 600) {
                    i--;
                }
            }
        }
    }
}