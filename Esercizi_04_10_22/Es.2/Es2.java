//Costruire un vettore di N posizioni, inserendo in ogni elemento il valore del suo indice. 

public class Es2 {
    public static void main(String[] args) {
        int n = 10;
        int[] vettore = new int[n];
        for(int i = 0; i < n; i++){
            vettore[i] = i;
            System.out.println(vettore[i]);
        }
    }
}
