import java.util.Scanner;

public class Es1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di persone da inserire: ");
        int n = input.nextInt();
        int[] persone = new int[n];
        for (int i = 0; i < persone.length; i++) {
            System.out.print("Inserisci l'età della persona " + (i + 1) + ": ");
            persone[i] = input.nextInt();
        }
    }
}
