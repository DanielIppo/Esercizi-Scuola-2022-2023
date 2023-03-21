public class Macchina extends Veicolo {

    public Macchina() {
        super(4, 400, "rosso");
    }
    public void accellera(String addizione) {
        System.out.println("La macchina accelera " + addizione);
    }
    public void frena(String addizione) {
        System.out.println("La macchina frena " + addizione);
    }

    public void accellera() {
        System.out.println("La macchina accelera");
    }
    public void frena() {
        System.out.println("La macchina frena");
    }

    public void stampaAttributi(int nPorte, double velocitaMassima, String colore){
        System.out.println("Numero di ruote: " + getnRuote(nPorte));
        System.out.println("Velocità massima: " + getVelocitaMassima(velocitaMassima));
        System.out.println("Colore: " + getColore(colore));
    }
}