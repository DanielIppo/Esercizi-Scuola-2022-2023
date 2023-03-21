public class Bicicletta extends Veicolo{
    public Bicicletta() {
        super(2, 20, "rosso");
    }

    public void accellera() {
        System.out.println("La bicicletta sta pedalando più velocemente");
    }
    public void frena() {
        System.out.println("La bicicletta frena");
    }

    public void stampaAttributi(int nPorte, double velocitaMassima, String colore){
        System.out.println("Numero di ruote: " + getnRuote(nPorte));
        System.out.println("Velocità massima: " + getVelocitaMassima(velocitaMassima));
        System.out.println("Colore: " + getColore(colore));
    }
}