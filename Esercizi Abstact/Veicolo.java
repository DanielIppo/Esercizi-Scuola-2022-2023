abstract class Veicolo {
    private int nRuote;
    private double velocitaMassima;
    private String colore;

    public Veicolo(int nRuote, double velocitaMassima, String colore) {
        setnRuote(nRuote);
        setVelocitaMassima(velocitaMassima);
        setColore(colore);
    }

    public int getnRuote() {
        return nRuote;
    }
    public double getVelocitaMassima() {
        return velocitaMassima;
    }
    public String getColore() {
        return colore;
    }
    public void setnRuote(int nRuote) {
        if(nRuote > 0 && nRuote < 4){
            this.nRuote = nRuote;
        }
    }
    public void setVelocitaMassima(double velocitaMassima) {
        if(velocitaMassima > 0 && velocitaMassima < 500){
            this.velocitaMassima = velocitaMassima;
        }
    }
    public void setColore(String colore) {
        this.colore = colore;
    }

    abstract void accellera();
    abstract void frena();
}
