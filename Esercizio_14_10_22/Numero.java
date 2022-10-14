import java.lang.Math;

public class Numero {

    public double quadrato(double n){
        return n*n;
    }

    public double radice(double n){
        return Math.sqrt(n);
    }

    public double fattoriale(double n){
        return n*fattoriale(n-1);
    }
    
    public double negazione (double n){
        return -n;
    }
    public String binEx(double n, String scelta){

        if(scelta.equals("binario") || scelta.equals("Binario")){
            return Integer.toBinaryString((int)n);
        }else if(scelta.equals("esadecimale") || scelta.equals("Esadecimale")){
            return Integer.toHexString((int)n);
        }
        return "Scelta non valida";

    }


}
