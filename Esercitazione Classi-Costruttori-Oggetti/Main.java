import datiPersone.Persone;

public class Main{
    public static void main(String[] args){

        Persone walter = new Persone("Walter", "Caltanissetta", 16);
        Persone giuseppe = new Persone("Giuseppe", "Milano", 30);
        Persone maria = new Persone("Maria", "Roma", 25);

        walter.showData();
        giuseppe.showData();
        maria.showData();
    }
}