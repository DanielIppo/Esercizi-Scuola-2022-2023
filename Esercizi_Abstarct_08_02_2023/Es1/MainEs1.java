public class MainEs1 {
    public static void main(String[] args) {
        Parallelepipedo p = new Parallelepipedo(2, 3);  
        Cilindro c = new Cilindro(2, 3);
        System.out.println("Volume Parallelepipedo: " + p.volume());
        System.out.println("Volume Cilindro: " + c.volume());
    }
}