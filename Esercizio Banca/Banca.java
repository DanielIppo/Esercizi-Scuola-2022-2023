import java.io.*;
import java.util.*;


public class Banca {
    ContoCorrente[] conti = new ContoCorrente[1000]; {
      new ContoCorrente("", "", 0);
    }

    private String[] intestatario = new String[1000];
    private String[] iban = new String[1000];
    private double[] saldo = new double[1000];

    public void uploadCSV() {
        try {
            File file = new File("esercizio Banca/conti.csv");
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                conti[i] = new ContoCorrente(values[0], values[1], Double.parseDouble(values[2]));
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void saveSVG() throws IOException{
        try(FileWriter fileWriter = new FileWriter("conti.csv")) {
            for (int i = 0; i < conti.length; i++) {
                fileWriter.write(intestatario[i] + "," + iban[i] + "," + saldo[i] + "\n");
            }
        }
      }
        
}
