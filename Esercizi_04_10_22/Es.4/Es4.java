//Dato un vettore di N elementi, determinare se ciascun elemento è pari o dispari.

public class Es4 {
    public static void main(String[] args){
        int [] vettore = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < vettore.length; i++){
            if(vettore[i] % 2 == 0){
                System.out.println("Il numero " + vettore[i] + " è pari");
            }else{
                System.out.println("Il numero " + vettore[i] + " è dispari");
            }
        }
    }
}
