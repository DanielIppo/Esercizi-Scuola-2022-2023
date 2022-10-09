import java.util.Scanner;

public class MainCC {

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void header(String header){
        System.out.println("*********************************************************\n********************" + header + "********************\n*********************************************************\n");
    }
    
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Banca banca = new Banca();

        header("****  Login  ****");
        System.out.print("Benvenuto in Banca\n\nEffettua il login per continuare:\nNome: ");
        String nome = in.nextLine();
        System.out.print("Password: ");
        String password = in.nextLine();
        banca.login(nome, password);   
        if (banca.utenteI == -1) {
            System.out.println("Login fallito, riprova..");
            sleep(1000);
            clearScreen();
            main(args);
            return;
        }
        sleep(1000);        
        clearScreen(); 
        header("****  Banca  ****");
        while(true){
            System.out.println("Benvenuto " + nome + "\n1. Visualizza Dati\n2. Deposita\n3. Preleva\n4. Bonifico\n5. Log Out\n6. Esci");
            int scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    clearScreen();
                    sleep(200);
                    header("****  Dati  *****");
                    System.out.println("Nome: " + banca.conti[banca.utenteI].nome + "\nCognome: " + banca.conti[banca.utenteI].cognome + "\nIBAN: " + banca.conti[banca.utenteI].iban + "\nSaldo: " + banca.conti[banca.utenteI].saldo);
                    sleep(3000);
                    break;
                case 2:
                    clearScreen();
                    sleep(200);
                    header("**  Deposita  ***");
                    System.out.print("Importo: ");
                    double importo = in.nextDouble();
                    banca.conti[banca.utenteI].deposita(importo);
                    break;
                case 3:
                    clearScreen();
                    sleep(200);
                    header("***  Preleva  ***");
                    System.out.print("Importo: ");
                    importo = in.nextDouble();
                    banca.conti[banca.utenteI].preleva(importo);
                    break;
                case 4:
                    clearScreen();
                    sleep(200);
                    header("**  Bonifico  ***");
                    System.out.print("IBAN: ");
                    String iban = in.next();
                    System.out.print("Importo: ");
                    importo = in.nextDouble();
                    banca.bonifico(iban, importo);
                    break;

                case 5:
                    clearScreen();
                    sleep(200);
                    header("***  Log Out  ***");
                    banca.utenteI = -1;
                    clearScreen();
                    main(args);
                    break;

                case 6:
                    clearScreen();
                    sleep(200);
                    banca.saveCSV("Esercizio Banca/conti.csv");
                    System.out.println("Grazie per aver usato il nostro servizio");
                    return;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
            sleep(1000);
            clearScreen();
        }
    }
}
