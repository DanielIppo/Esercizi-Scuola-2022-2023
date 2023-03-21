import java.util.Scanner;

public class MainImmobile{

    static Scanner input = new Scanner(System.in);

    static Immobile immobile1 = new Immobile("Via Roma 1", "Mario Rossi", "Casa", 100, 1, 5, 100000);
    static Immobile immobile2 = new Immobile("Via Rochester", "Matteo Giardina", "Villa", 260, 3, 15, 1000000);
    static Immobile immobile3 = new Immobile("Viale Trieste 36", "Stefano Caio", "Appartamento", 70, 1, 7, 70000);

    public static void main(String[] args) {

        System.out.println("Indirizzo: " + immobile1.getIndirizzo());
        System.out.println("Prezzo: " + immobile1.getPrezzo());
        System.out.println("Cambiare prezzo?");
        String risposta = input.nextLine();
        if (risposta.equals("si")) {
            System.out.println("Inserisci nuovo prezzo: ");
            double nuovoPrezzo = input.nextDouble();
            immobile1.setPrezzo(nuovoPrezzo);
        }
        immobile1.showData();

        System.out.println("***************************************************************************");

        System.out.println("Indirizzo: " + immobile2.getIndirizzo());
        System.out.println("Prezzo: " + immobile2.getPrezzo());
        immobile2.showData();

        System.out.println("***************************************************************************");

        System.out.println("Indirizzo: " + immobile3.getIndirizzo());
        System.out.println("Prezzo: " + immobile3.getPrezzo());
        System.out.println("Cambiare prezzo?");
        risposta = input.nextLine();
        if (risposta.equals("si")) {
            System.out.println("Inserisci nuovo prezzo: ");
            double nuovoPrezzo = input.nextDouble();
            immobile3.setPrezzo(nuovoPrezzo);
        }
        immobile3.showData();
        
    }
}