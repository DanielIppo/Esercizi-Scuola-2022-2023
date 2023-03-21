import java.util.Scanner;

public class Alimentari extends Merce {
    Scanner input = new Scanner(System.in); //Creo un oggetto di tipo Scanner per l'input da tastiera nell'eventualità di un'inserimento di dati errato

    public Alimentari(String codiceFornitore, int quantita, int scortaMinima, String descrizione, double prezzoUnitario, String dataScadenza, boolean lattosio, boolean glutine) {
        super(codiceFornitore, quantita, scortaMinima, descrizione, prezzoUnitario);
        setDataScadenza(dataScadenza);
        setLattosio(lattosio);
        setGlutine(glutine);        
    }

    public void setDataScadenza(String dataScadenza){//Creo il metodo setDataScadenza per controllare che la data di scadenza inserita sia valida
        this.merce[6] = dataScadenza;
    }
    public void setLattosio(boolean lattosio){//Creo il metodo setLattosio per controllare che il valore inserito sia valido
        if(lattosio == true || lattosio == false){
            this.merce[7] = String.valueOf(lattosio);
        } else {
            this.merce[7] = "Valore non valido";
        }
    }
    public void setGlutine(boolean glutine){//Creo il metodo setGlutine per controllare che il valore inserito sia valido
        if(glutine == true || glutine == false){
            this.merce[8] = String.valueOf(glutine);
        } else {
            this.merce[8] = "Valore non valido";
        }
    }
    public String getDataScadenza(){
        return this.merce[6];
    }
    public String getLattosio(){
        if(this.merce[7].equals("true")){
            return "Lattosio";
        } else {
            return "Senza lattosio";
        }
    }
    public String getGlutine(){
        if(this.merce[8].equals("true")){
            return "Glutine";
        } else {
            return "Senza glutine";
        }
    }
}
