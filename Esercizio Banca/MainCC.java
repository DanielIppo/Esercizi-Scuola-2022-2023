
public class MainCC {
    public static void main(String[] args){
        Banca banca = new Banca();
        banca.uploadCSV();
        banca.conti[0].deposita(100);
        banca.conti[0].stampa();        
    }
}
