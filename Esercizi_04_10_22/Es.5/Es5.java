/*5. Implementare una classe che rappresenti le caratteristiche e le funzionalità di un computer. 
Di questa classe implementare due metodi, uno che stampi le caratteristiche dell'oggetto e l'altro per il potenziamento della RAM: 
dato in ingresso il numero di Gigabyte aggiuntivi ne registri l'incremento sull'oggetto. Implementare, inoltre, 
all'interno del metodo main più oggetti, cioè più computer con caratteristiche diverse e per ogni caso richiamare i metodi.*/

import java.util.Scanner; 
import java.util.concurrent.TimeUnit;

public class Es5 {
    static Computer pc1 = new Computer(8, 1000, 500, "Intel Core i7-9700K", "Nvidia GeForce RTX 2060 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200, false);
    static Computer pc2 = new Computer(16, 2000, 550, "Amd Ryzen 5 5600X", "Nvidia GeForce RTX 3080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200, true);
    static Computer pc3 = new Computer(32, 1000, 500, "Intel Core i8-9800K", "Nvidia GeForce RTX 2080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200, false);
    static Computer pc4 = new Computer(64, 2500, 700, "Intel Core i9-12900K", "Nvidia GeForce RTX 4080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200, false);
    static Computer pc5 = new Computer(12, 1000, 500, "Intel Core i7-9700K", "Nvidia GeForce RTX 2080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200, false);
    static Computer pc6 = new Computer(4, 500, 500, "Amd Ryzen 9 7950X", "Nvidia GeForce RTX 1650 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200, true);
    



    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Scegli un computer da vedere i dati: ");
            System.out.println("1. PC1");
            System.out.println("2. PC2");
            System.out.println("3. PC3");
            System.out.println("4. PC4");
            System.out.println("5. PC5");
            System.out.println("6. PC6");
            System.out.println("7. Esci");
            
            int choice = input.nextInt();
            if (choice == 1){
                pc1.showData();
                System.out.println("Aggiungere RAM? (1 = Si, 2 = No)");
                int choice2 = input.nextInt();
                if (choice2 == 1){
                    System.out.println("Quanti GB vuoi aggiungere?");
                    int addedRam = input.nextInt();
                    pc1.addRam(addedRam);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                    pc1.showData();
                } else {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                }
            }
            else if(choice == 2){
                pc2.showData();
                System.out.println("Aggiungere RAM? (1 = Si, 2 = No)");
                int choice2 = input.nextInt();
                if (choice2 == 1){
                    System.out.println("Quanti GB vuoi aggiungere?");
                    int addedRam = input.nextInt();
                    pc2.addRam(addedRam);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                    pc2.showData();
                } else {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                }
            }
            else if(choice == 3){
                pc3.showData();
                System.out.println("Aggiungere RAM? (1 = Si, 2 = No)");
                int choice2 = input.nextInt();
                if (choice2 == 1){
                    System.out.println("Quanti GB vuoi aggiungere?");
                    int addedRam = input.nextInt();
                    pc3.addRam(addedRam);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                    pc3.showData();
                } else {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                }
            }
            else if(choice == 4){
                pc4.showData();
                System.out.println("Aggiungere RAM? (1 = Si, 2 = No)");
                int choice2 = input.nextInt();
                if (choice2 == 1){
                    System.out.println("Quanti GB vuoi aggiungere?");
                    int addedRam = input.nextInt();
                    pc4.addRam(addedRam);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                    pc4.showData();
                } else {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                }
            }
            else if(choice == 5){
                pc5.showData();
                System.out.println("Aggiungere RAM? (1 = Si, 2 = No)");
                int choice2 = input.nextInt();
                if (choice2 == 1){
                    System.out.println("Quanti GB vuoi aggiungere?");
                    int addedRam = input.nextInt();
                    pc5.addRam(addedRam);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                    pc5.showData();
                } else {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                }
            }
            else if(choice == 6){
                pc6.showData();
                System.out.println("Aggiungere RAM? (1 = Si, 2 = No)");
                int choice2 = input.nextInt();
                if (choice2 == 1){
                    System.out.println("Quanti GB vuoi aggiungere?");
                    int addedRam = input.nextInt();
                    pc6.addRam(addedRam);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                    pc6.showData();
                } else {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.print("\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J\033[H\033[2J"); 
                }
            }
            else if(choice == 7){
                break;
            }
            else{
                System.out.println("Scelta non valida");
            }

        }
    }
}


