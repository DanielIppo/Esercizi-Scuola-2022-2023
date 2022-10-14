/*Implementare la classe Numero che memorizzi un numero intero. La classe dovrà avere i seguenti metodi:
- quadrato, che restituisca il quadrato del numero;
- radice, che ne restituisca la radice;
- fattoriale, che ne restituisca il fattoriale, esempio: !5 = 5*4*3*2*1
- negazione, che inverta il segno di Numero
- binario ed esadecimale, che restituisca rispettivamente il corrispondente in binario ed esadecimale. */

import java.util.Scanner;

public class Main {

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

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Numero n = new Numero();
        double numero;

        while(true){
            System.out.println("Cosa vuoi fare?\n1. Quadrato di un numero\n2. Radice di un numero\n3. Fattoriale di un numero\n4. Negazione di un numero\n5. Incrementa di 1\n6. Decrementa di uno\n7. Risolvi un'equazione di secondo grado\n8. Binaro o esadecimale");
            int scelta = input.nextInt();
            switch(scelta){
                case 1: 
                    clearScreen();
                    System.out.println("Inserisci il numero");
                    numero = input.nextInt();
                    System.out.println("Il quadrato di " + numero + " è " + n.quadrato(numero));
                    sleep(2000);
                    clearScreen();
                case 2:
                    clearScreen();
                    System.out.println("Inserisci il numero");
                    numero = input.nextInt();
                    System.out.println("La radice di " + numero + " è " + n.radice(numero));
                    sleep(2000);
                    clearScreen();

                case 3:
                    clearScreen();
                    System.out.println("Inserisci il numero");
                    numero = input.nextInt();
                    System.out.println("Il fattoriale di " + numero + " è " + n.fattoriale(numero));
                    sleep(2000);
                    clearScreen();

                case 4:
                    clearScreen();
                    System.out.println("Inserisci il numero");
                    numero = input.nextInt();
                    System.out.println("La negazione di " + numero + " è " + n.negazione(numero));
                    sleep(2000);
                    clearScreen();

                case 5:
                    clearScreen();
                    System.out.println("Inserisci il numero");
                    numero = input.nextInt();
                    System.out.println("Il numero incrementato di 1 è " + n.incrementa(numero));
                    sleep(2000);
                    clearScreen();

                case 6:
                    clearScreen();
                    System.out.println("Inserisci il numero");
                    numero = input.nextInt();
                    System.out.println("Il numero decrementato di 1 è " + n.decrementa(numero));
                    sleep(2000);
                    clearScreen();

                case 7:
                    clearScreen();
                    System.out.print("Inserisci la tua a: ");
                    double a = input.nextDouble();
                    System.out.print("Inserisci la tua b: ");
                    double b = input.nextDouble();
                    System.out.print("Inserisci la tua c: ");
                    double c = input.nextDouble();
                    double[] equazione = n.equazione(a, b, c);
                    System.out.println("Il tuo primo risultato è: " + equazione[0] + "\nIl tuo secondo risultato è: " + equazione[1]);
                    sleep(5000);
                    clearScreen();

                case 8:
                    clearScreen();
                    System.out.println("Inserisci il numero");
                    numero = input.nextInt();
                    System.out.println("Inserisci se vuoi il binario o l'esadecimale");
                    String sceltaBinEx = input.next();
                    System.out.println("Il numero " + numero + " in " + sceltaBinEx + " è " + n.binEx(numero, sceltaBinEx));
                    sleep(2000);
                    clearScreen();

                default:
                    clearScreen();
                    System.out.println("Scelta non valida");
                    sleep(2000);
                    clearScreen();
            }
        }   
            
    }
}
