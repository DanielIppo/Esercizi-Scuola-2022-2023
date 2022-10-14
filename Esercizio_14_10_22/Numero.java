import java.lang.Math;

public class Numero {

    public double incrementa(double n){
        return n + 1;
    }

    public double decrementa(double n){
        return n - 1;
    }

    public double quadrato(double n){
        return n*n;
    }

    public double radice(double n){
        return Math.sqrt(n);
    }

    public double fattoriale(double n){
        if(n != 0){
            return n*fattoriale(n-1);
        } else {
            return 1;
        }
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

    public double[] equazione(double a, double b, double c){
        double[] soluzioni = new double[2];
        double delta = b*b - 4*a*c;
        if(delta > 0){
            soluzioni[0] = (-b + Math.sqrt(delta))/(2*a);
            soluzioni[1] = (-b - Math.sqrt(delta))/(2*a);
        }else if(delta == 0){
            soluzioni[0] = -b/(2*a);
            soluzioni[1] = -b/(2*a);
        }else{
            soluzioni[0] = 0;
            soluzioni[1] = 0;
        }
        return soluzioni;
    }


}
