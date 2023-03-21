import java.util.ArrayList;

public class Cartellone {
    private ArrayList<Integer> numeri = new ArrayList<Integer>();

    public int pescaNumero(){
        if (numeri.size() == 89) {
            return -1;
        }
        int numero = (int) (Math.random() * 90 + 1); 
        if (numeri.contains(numero)) {
            pescaNumero();
        }
        numeri.add(numero);
        return numero;
    }

    public int verVincita(Boolean verVincite[]){
        int cont = 0, vincita = -1, contTot = 0;
        for (int i = 0; i != 90; i+=30) {
            for(int l = 0; l < 3; l++) {
                for(int j = 1; j <= 5; j++) {
                    if(numeri.contains(l * 10 + j + i)) {
                        cont++;
                        contTot++;
                    }
                }
                if(cont > 1 && verVincite[(cont - 1)] == false) {
                    vincita = cont - 1;
                }
                cont = 0;
            }
            if(contTot == 15) {
                vincita = 0;
            }
            contTot = 0;

            for(int l = 0; l < 3; l++) {
                for(int j = 6; j <= 10; j++) {
                    if(numeri.contains(l * 10 + j + i)) {
                        cont++;
                        contTot++;
                    }
                }
                if(cont > 1 && verVincite[(cont - 1)] == false) {
                    vincita = cont - 1;
                }
                cont = 0;
            }
            if(contTot == 15) {
                vincita = 0;
            }
            contTot = 0;
        }
        return vincita;
    }

}
