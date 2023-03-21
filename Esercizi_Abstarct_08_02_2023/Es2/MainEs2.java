public class MainEs2{
    public static void main(String[] args){
        Moneta moneta = new Moneta();
        Dado dado = new Dado();
        System.out.println("Lancio la moneta: " + moneta.lanciaMoneta());
        System.out.println("Lancio il dado: " + dado.lanciaDado());
    }
}