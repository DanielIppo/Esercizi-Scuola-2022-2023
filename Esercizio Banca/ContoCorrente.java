public class ContoCorrente {
    public double saldo;
    public String intestatario, iban;

    public ContoCorrente(String intestatario, String iban, double saldo) {
        this.intestatario = intestatario;
        this.iban = iban;
        this.saldo = saldo;
    }


    public void preleva(double importo) {
        if (importo > saldo) {
            System.out.println("Saldo insufficiente");
        } else {
            saldo -= importo;
        }
    }

    public void deposita(double importo) {
        saldo += importo;
    }

    public void stampa() {
        System.out.println("Intestatario: " + intestatario);
        System.out.println("IBAN: " + iban);
        System.out.println("Saldo: " + saldo);
    }
}
