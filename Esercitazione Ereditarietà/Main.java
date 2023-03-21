public class Main {
    public class main {
        public static void main(String[] args) {
            Veicolo Auto = new Auto("Ferrari", 1987, 4000, 3, "Benzina");
            Veicolo Furgone = new Furgone("Volvo", 2015, 1900, 700);
            Veicolo Moto = new Moto("TM",2023, 350, 2);
            
            System.out.println(Auto.getInfo());
            System.out.println(Furgone.getInfo());
            System.out.println(Moto.getInfo());
        }
    }
}
