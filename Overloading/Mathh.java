import java.lang.Math;
public class Mathh{
    public double somma(int a, int b){
        return a + b;
    }
    public double somma(int a, int b, int c){
        return a + b + c;
    }
    public double somma(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public double sottrazione(int a, int b){
        return a - b;
    }
    public double sottrazione(int a, int b, int c){
        return a - b - c;
    }
    public double sottrazione(int a, int b, int c, int d){
        return a - b - c - d;
    }

    public double radiceDiSomma(int a, int b){
        return Math.sqrt(a + b);
    }
    public double radiceDiSomma(int a, int b, int c){
        return Math.sqrt(a + b + c);
    }
    public double radiceDiSomma(int a, int b, int c, int d){
        return Math.sqrt(a + b + c + d);
    }
}