import java.util.Scanner;

public class Casalinghi extends Merce{
    Scanner input = new Scanner(System.in); //Creo un oggetto di tipo Scanner per l'input da tastiera nell'eventualità di un'inserimento di dati errato

    public Casalinghi(String codiceFornitore, int quantita, int scortaMinima, String descrizione, double prezzoUnitario, String tipo) {
        super(codiceFornitore, quantita, scortaMinima, descrizione, prezzoUnitario);
        setTipo(tipo);
    }

    public void setTipo(String tipo){//Creo il metodo setTipo per controllare che il tipo inserito sia valido
        if(tipo.toLowerCase().equals("liquido") || tipo.toLowerCase().equals("polvere") || tipo.toLowerCase().equals("solido")){
            this.merce[6] = tipo;
        } else {
            this.merce[6] = "Tipo non valido";
        }
    }
    
}
