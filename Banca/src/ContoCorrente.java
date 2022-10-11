public class ContoCorrente {
    public double saldo;
    public String nome, cognome, iban, password;

    public ContoCorrente(String nome, String cognome, String iban, String password, double saldo) {
        this.nome = nome;
        this.cognome = cognome;
        this.iban = iban;
        this.saldo = saldo;
        this.password = password;
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
        System.out.println("Intestatario: " + nome + " " + cognome);
        System.out.println("IBAN: " + iban);
        System.out.println("Saldo: " + saldo);
    }


    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getIban() {
        return this.iban;
    }


    public double getSaldo() {
        return this.saldo;
    }

    public String getPassword() {
        return this.password;
    }
}
