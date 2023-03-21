public class Main{
    public static void main(String[] args){
        Mathh math = new Mathh();
        
        System.out.println("Somma tra 2 numeri: " + math.somma(1, 2));
        System.out.println("Somma tra 3 numeri: " + math.somma(1, 2, 3));
        System.out.println("Somma tra 4 numeri: " + math.somma(1, 2, 3, 4));

        System.out.println("Sottrazione tra 2 numeri: " + math.sottrazione(1, 2));
        System.out.println("Sottrazione tra 3 numeri: " + math.sottrazione(1, 2, 3));
        System.out.println("Sottrazione tra 4 numeri: " + math.sottrazione(1, 2, 3, 4));

        System.out.println("Radice di somma tra 2 numeri: " + math.radiceDiSomma(1, 2));
        System.out.println("Radice di somma tra 3 numeri: " + math.radiceDiSomma(1, 2, 3));
        System.out.println("Radice di somma tra 4 numeri: " + math.radiceDiSomma(1, 2, 3, 4));

    }
}