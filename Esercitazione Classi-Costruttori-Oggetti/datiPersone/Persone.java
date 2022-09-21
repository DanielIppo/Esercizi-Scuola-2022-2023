package datiPersone;

public class Persone {

    public int eta;
    public String nome, citta;

    public void showData(){
        System.out.println("Nome: " + nome);
        System.out.println("Città: " + citta);
        System.out.println("Età: " + eta);
    }

    public Persone(String nome, String citta, int eta) {
        this.nome = nome;
        this.citta = citta;
        this.eta = eta;
    }
}
