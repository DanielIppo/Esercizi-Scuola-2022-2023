public class Immobile {
    public String indirizzo, proprietario, tipo;
    public int superficie, piano, nStanze;
    public double prezzo;

    public Immobile(String indirizzo, String proprietario, String tipo, int superficie, int piano, int nStanze, double prezzo) {
        this.indirizzo = indirizzo;
        this.proprietario = proprietario;
        this.tipo = tipo;
        this.superficie = superficie;
        this.piano = piano;
        this.nStanze = nStanze;
        this.prezzo = prezzo;
    }
    
    public String getIndirizzo() {
        return indirizzo;
    }
    public double getPrezzo() {
        return prezzo;
    }

    public void showData() {
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Tipo: " + tipo);
        System.out.println("Superficie: " + superficie);
        System.out.println("Piano: " + piano);
        System.out.println("Numero di stanze: " + nStanze);
        System.out.println("Prezzo: " + prezzo);
    }

    public void setPrezzo(double nuovoPrezzo) {
        prezzo = nuovoPrezzo;
    }

}
