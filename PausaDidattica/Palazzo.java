/*Implementare la classe palazzo con le seguenti caratteristiche:
 * Numero di piani;
 * Metri quadri per appartamento;
 * Via e numero civico;
 * Città;
 * Creare 3 oggetti per questa classe con caratteristiche differenti
 * Es 2
 * Nella stessa classe implementare:
 * Una funzione che i piani siano minimo 3 massimo 30;
 * Una funzione che i metri quadri siano massimo 200;
 * Una funzione per calcolare il valore del palazzo in base ai metri quadri e al numero di piani;
 * Una funzione per la stampa a schermo di tutto;
*/
import java.util.Scanner;

public class Palazzo{
    Scanner input = new Scanner(System.in);
    private int piani, metriQuadri, numeroCivico;
    private String via, città;

    public Palazzo(int piani, int metriQuadri, String via, int numeroCivico, String citta){
        setPiani(piani);
        setMetriQuadri(metriQuadri);
        setVia(via);
        setNumeroCivico(numeroCivico);
        setCitta(citta);
    }

    public void setPiani(int piani){
        if(piani >= 3 && piani <= 30){
            this.piani = piani;
        }else{
            System.out.print("Inserisci un numero di piani valido!\n>");
            setPiani(input.nextInt());
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
    public void setMetriQuadri(int metriQuadri){
        if(metriQuadri <= 200){
            this.metriQuadri = metriQuadri;
        }else{
            System.out.print("Inserisci un numero di metri quadri valido!\n>");
            setMetriQuadri(input.nextInt());
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
    public void setVia(String via){
        this.via = via;
    }
    public void setNumeroCivico(int numeroCivico){
        this.numeroCivico = numeroCivico;
    }
    public void setCitta(String citta){
        this.città = citta;
    }

    public float getValore(){
        return (this.piani * this.metriQuadri) * 1000;
    }

    public void stampa(){
        System.out.println("Città: " + this.città + "\nVia: " + this.via + "\nNumero civico: " + this.numeroCivico  + "\nPiani: " + this.piani + "\nMetri quadri: " + this.metriQuadri + "\nValore: " + getValore());
    }
}
