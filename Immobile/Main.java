package Immobile;

public class Main{
    public static void main(String[] args) {
        Immobile immobile = new Immobile();
        immobile.init();
        System.out.println("Valore totale: " + immobile.getValoreTot());
        System.out.println("Tasse registro: " + immobile.getTasseRegistro());
        System.out.println("Canone affitto: " + immobile.getCanoneAffitto());
    }
}