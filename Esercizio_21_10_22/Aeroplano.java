package Esercizio_10_21_22;

public class Aeroplano {
    private String nomeAereo;
    private int velocitaMassima, velocitaCrociera, nMotori;

    public Aeroplano(String nomeAereo, int velocitaMassima, int velocitaCrociera, int nMotori) {
        this.nomeAereo = nomeAereo;
        this.velocitaMassima = velocitaMassima;
        this.velocitaCrociera = velocitaCrociera;
        this.nMotori = nMotori;
    }
    public void setNomeAereo(String nomeAereo) {
        this.nomeAereo = nomeAereo;
    }
    public void setVelocitaMassima(int velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }
    public void setVelocitaCrociera(int velocitaCrociera) {
        this.velocitaCrociera = velocitaCrociera;
    }
    public void setnMotori(int nMotori) {
        this.nMotori = nMotori;
    }
    public String getNomeAereo() {
        return nomeAereo;
    }
    public int getVelocitaMassima() {
        return velocitaMassima;
    }
    public int getVelocitaCrociera() {
        return velocitaCrociera;
    }
    public int getnMotori() {
        return nMotori;
    }

    public void info(){
        System.out.println("Nome aereo: " + nomeAereo);
        System.out.println("Velocità massima: " + velocitaMassima);
        System.out.println("Velocità crociera: " + velocitaCrociera);
        System.out.println("Numero motori: " + nMotori);
    }

}
