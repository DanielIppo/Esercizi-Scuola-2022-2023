//Caricare un vettore di N posizioni, stampando la somma dei suoi elementi. 
import java.util.Scanner;

public class Es3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = 10;
        int[] vettore = new int[n];

        System.out.println("Inserisci dei valori da sommare successivamente: ");
        for (int i = 0; i < n; i++){
            System.out.print(i + ": ");
            vettore[i] = input.nextInt();
        }
        int somma = 0;
        for(int i = 0; i < n; i++){
            somma += vettore[i];
        }
        System.out.println("La somma del vettore è: "+somma);
    }
    
}