public class Main {
    public static void main(String[] args) {
        Macchina supra = new Macchina();
        supra.accellera("SSUUUUUUUUIIIIIIII");
        supra.frena("STUTUTUTUTUTU");

        Macchina mercedes = new Macchina();
        mercedes.accellera();
        mercedes.frena();

        

        supra.stampaAttributi();
    }
}