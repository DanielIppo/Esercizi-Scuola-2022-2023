import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Cartellone cartellone = new Cartellone();
        int nCartelle;
        System.out.print("Inserisci il numero di cartelle da giocare: ");
        nCartelle = input.nextInt();
        Cartella[] cartelle = new Cartella[nCartelle];

        for (int i = 0; i < nCartelle; i++) {
            cartelle[i] = new Cartella();
            cartelle[i].stampaCartella();
        }

        String[] vincite = {"Tombola", "Ambo", "Terna", "Quaterna", "Cinquina"};
        Boolean[] verVincite = {false, false, false, false, false};
        int numero, vincita, vinto = -3;
        ArrayList<Integer> numeriVinti = new ArrayList<Integer>();
        final String sistemaOperativo = System.getProperty("os.name");


        while(vinto == -3) {
            System.out.print("Premi invio per estrarre un numero: ");
            input.nextLine();
            numero = cartellone.pescaNumero();

            if (sistemaOperativo.contains("Windows")) {
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Numero estratto:" + numero);
            vincita = cartellone.verVincita(verVincite);
            System.out.println();
            for (int i = 0; i < nCartelle; i++) {
                cartelle[i].verNumero(numero);
            }
            for (int i = 0; i < nCartelle; i++) {
                vincita = cartelle[i].verVincita(verVincite);
                if (vincita > -1) {
                    numeriVinti.add(i);
                    if(vincita == 0) {
                        vinto = i;
                    }
                }
                cartelle[i].stampaCartella();
                System.out.println();
            }

            vincita = cartellone.verVincita(verVincite);
            if (vincita > -1) {
                numeriVinti.add(-1);
                if(vincita == 0) {
                    vinto = -1;
                }
            }

            if(numeriVinti.size() > 0 && vincita > -1) {
                System.out.print("Hanno fatto " + vincite[vincita] + ": ");
                for (int i = 0; i < numeriVinti.size(); i++) {
                    if(numeriVinti.get(i) == -1) {
                        System.out.print("cartellone");
                    } else {
                        System.out.print("Cartella " + (numeriVinti.get(i) + 1));
                    }
                    if(i != numeriVinti.size() - 1) {
                        System.out.print(", ");
                    }
                }
                verVincite[vincita] = true;
                System.out.println();
            }

            numeriVinti.clear();
        }

        input.close();

        if(vinto == -1) {
            System.out.println("Il cartellone ha vinto la tombola!");
        } else {
            System.out.println("La cartella " + (vinto + 1) + " ha vinto la tombola!");
        }
    }
}