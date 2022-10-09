import java.io.*;
import java.util.*;


public class Banca {

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    ContoCorrente[] conti = new ContoCorrente[3];
    private File file = new File("Esercizio Banca/conti.csv");
    int utenteI = -1;

    public Banca() {
        try {
            File file = new File("esercizio Banca/conti.csv");
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                conti[i] = new ContoCorrente(values[0], values[1], values[3], values[4], Double.parseDouble(values[2]));
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveCSV(String path) {
        File tempFile = new File(path);
        try {
            tempFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(tempFile);
            for (int i = 0; i < conti.length; i++) {
                writer.write(conti[i].nome + ";" + conti[i].cognome + ";" + conti[i].saldo + ";" + conti[i].iban + ";" + conti[i].password + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!file.delete()) {
            System.out.println("Impossibile cancellare il file");
            return;
        } else {
            if(!tempFile.renameTo(file)) {
                System.out.println("Impossibile rinominare il file");
            }
        }
    }

    public void login(String nome, String password){
        for (int i = 0; i < conti.length; i++) {
            if (conti[i].nome.equals(nome) && conti[i].password.equals(password)) {
                utenteI = i;
                System.out.println("Login effettuato con successo");
                break;
            }
        }
    }

    public void bonifico(String iban, double importo) {
        if (utenteI == -1) {
            System.out.println("Effettua il login");
            return;          
        }
        boolean flag = false;
        for (int i = 0; i < conti.length; i++) {
            if (conti[i].iban.equals(iban)) {
                conti[utenteI].preleva(importo);
                conti[i].deposita(importo);
                flag = true;
                break;
            } 
        }
        if (flag == false) {
            System.out.println("IBAN non trovato, riprova");
            sleep(400);
            clearScreen();
            return;
        }
    }

}
