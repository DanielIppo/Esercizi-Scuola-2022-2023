import java.util.Scanner;

public class Merce {
    Scanner input = new Scanner(System.in); //Creo un oggetto di tipo Scanner per l'input da tastiera nell'eventualità di un'inserimento di dati errato

    private static int progressivo = 0;

    // sequenza array ["numeroProgessivo", "codiceFornitore", "quantita", "scortaMinima", "descrizione", "prezzoUnitario"]
    protected String[] merce = new String[9]; //Creo un array di stringhe per memorizzare i dati della merce

    public Merce( String codiceFornitore, int quantita, int scortaMinima, String descrizione, double prezzoUnitario) { //Creo il costruttore
        this.merce[0] = String.valueOf(progressivo++);
        this.merce[1] = codiceFornitore;
        setQuantita(quantita);
        setScortaMinima(scortaMinima);
        this.merce[4] = descrizione;
        setPrezzo(prezzoUnitario);
    }

    public void setPrezzo(double prezzoUnitario){//Creo il metodo setPrezzo per controllare che il prezzo inserito sia valido
        if(prezzoUnitario > 0){
            this.merce[5] = String.valueOf(prezzoUnitario);
        } else {
            System.out.println("Prezzo non valido");
            System.out.println("Inserisci un prezzo valido: ");
            setPrezzo(input.nextDouble());
        }
    }
    public void setScortaMinima(int scortaMinima){//Creo il metodo setScortaMinima per controllare che la scorta minima inserita sia valida
        if(scortaMinima > 0){
            this.merce[3] = String.valueOf(scortaMinima);
        } else {
            System.out.println("Scorta minima non valida");
            System.out.println("Inserisci una scorta minima valida: ");
            setScortaMinima(input.nextInt());
        }
    }
    public void setQuantita(int quantita){//Creo il metodo setQuantita per controllare che la quantità inserita sia valida
        if(quantita > 0){
            this.merce[2] = String.valueOf(quantita);
        } else {
            System.out.println("Quantità non valida");
            System.out.println("Inserisci una quantità valida: ");
            setQuantita(input.nextInt());
        }
    }
    public int getProgressivo(){
        return Integer.parseInt(this.merce[0]);
    }
    public String getCodiceFornitore(){
        return this.merce[1];
    }
    public int getQuantita(){
        return Integer.parseInt(this.merce[2]);
    }
    public int getScortaMinima(){
        return Integer.parseInt(this.merce[3]);
    }
    public String getDescrizione(){
        return this.merce[4];
    }
    public double getPrezzo(){
        return Double.parseDouble(this.merce[5]);
    }
    public String getTipo(){
        return this.merce[6];
    }
}
