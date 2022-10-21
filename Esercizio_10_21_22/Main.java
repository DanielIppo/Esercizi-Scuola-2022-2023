package Esercizio_10_21_22;

import java.util.Scanner;

public class Main {

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Aeroplano aereo1 = new Aeroplano("Boeing 747", 900, 800, 4);
        Aeroplano aereo2 = new Aeroplano("Airbus A380", 700, 600, 2);
        aereo1.info();
        System.out.println("\n*************************************\n");
        aereo2.info();
        
        sleep(2000);
        clearScreen();

        aereo1.setVelocitaCrociera(1000);
        aereo1.setNomeAereo("Boeing 747-8");

        aereo2.setVelocitaCrociera(800);
        aereo2.setNomeAereo("Airbus A380-800");

        aereo1.info();
        System.out.println("\n*************************************\n");
        aereo2.info();

    }
}
