public class Persona {
    public String nome, cognome, sesso, citta, coloreCapelli, orientamentoSessuale;
    public int eta;
    public float altezza, peso;

    public Persona(String nome, String cognome, String sesso, String orientamentoSessuale, String citta, String coloreCapelli, int eta, float altezza, float peso) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.orientamentoSessuale = orientamentoSessuale;
        this.citta = citta;
        this.coloreCapelli = coloreCapelli;
        this.eta = eta;
        this.altezza = altezza;
        this.peso = peso;
    }

    public void showData(){
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Sesso: " + sesso);
        System.out.println("Orientamento sessuale: " + orientamentoSessuale);
        System.out.println("Città: " + citta);
        System.out.println("Colore dei capelli: " + coloreCapelli);
        System.out.println("Età: " + eta);
        System.out.println("Altezza: " + altezza);
        System.out.println("Peso: " + peso);
    }
}
