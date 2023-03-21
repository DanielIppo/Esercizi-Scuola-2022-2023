public class Main{
    public static void main(String[] args){
        Alimentari[] alimentari = new Alimentari[10000];
        Casalinghi[] casalinghi = new Casalinghi[10000];
        Abbigliamento[] abbigliamento = new Abbigliamento[10000];
        new Magazzino(alimentari, casalinghi, abbigliamento);
    }
}