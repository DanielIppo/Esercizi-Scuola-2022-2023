public class Macchina extends Veicolo {

    public Macchina() {
        super(4, 400, "rosso");
    }
    public void accellera() {
        System.out.println("La macchina accelera, SUUUUUUUU");
    }
    public void frena() {
        System.out.println("La macchina frena, STUTUTU");
    }
    public void stampaAttributi(){
        System.out.println("Numero di ruote: " + getnRuote());
        System.out.println("Velocità massima: " + getVelocitaMassima());
        System.out.println("Colore: " + getColore());
    }
}