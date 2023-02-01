public class Main {
    public static void main(String[] args){
        Palazzo palazzo1 = new Palazzo(3, 1000, "Via Roma", 1, "Roma");
        Palazzo palazzo2 = new Palazzo(4, 150, "Via Milano", 2, "Milano");
        Palazzo palazzo3 = new Palazzo(5, 200, "Via Napoli", 3, "Napoli");
        palazzo1.stampa();
        System.out.println();
        palazzo2.stampa();
        System.out.println();
        palazzo3.stampa();
        System.out.println();
    }
}
