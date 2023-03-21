import java.util.Scanner;

public class Abbigliamento extends Merce{
    Scanner input = new Scanner(System.in); //Creo un oggetto di tipo Scanner per l'input da tastiera nell'eventualità di un'inserimento di dati errato

    public Abbigliamento(String codiceFornitore, int quantita, int scortaMinima, String descrizione, double prezzoUnitario, int taglia, String colore, String tipo) {
        super(codiceFornitore, quantita, scortaMinima, descrizione, prezzoUnitario);
        setTaglia(taglia);
        setColore(colore);
        setTipo(tipo);
    }

    public void setTaglia(int Taglia){//Creo il metodo setTaglia per controllare che la taglia inserita sia corretta
        if(Taglia >= 20 && Taglia <= 90){
            this.merce[6] = String.valueOf(Taglia);
        } else {
            this.merce[6] = "Taglia non valida";
        }
    }
    public void setColore(String colore){//Creo il metodo setColore per controllare che il colore inserito sia corretto
        if(colore.toLowerCase().equals("nero") || colore.toLowerCase().equals("bianco") || colore.toLowerCase().equals("rosso") || colore.toLowerCase().equals("verde") || colore.toLowerCase().equals("blu") || colore.toLowerCase().equals("giallo") || colore.toLowerCase().equals("arancione") || colore.toLowerCase().equals("viola") || colore.toLowerCase().equals("grigio") || colore.toLowerCase().equals("marrone") || colore.toLowerCase().equals("rosa")){
            this.merce[7] = colore;
        } else {
            this.merce[7] = "Colore non valido";
        }
    }
    public void setTipo(String tipo){//Creo il metodo setTipo per controllare che il tipo inserito sia corretto
        if(tipo.toLowerCase().equals("maglietta") || tipo.toLowerCase().equals("pantaloni") || tipo.toLowerCase().equals("giacca") || tipo.toLowerCase().equals("scarpe") || tipo.toLowerCase().equals("cappello") || tipo.toLowerCase().equals("cintura") || tipo.toLowerCase().equals("cravatta") || tipo.toLowerCase().equals("calzini")){
            this.merce[8] = tipo;
        } else {
            this.merce[8] = "Tipo non valido";
        }
    }
}
