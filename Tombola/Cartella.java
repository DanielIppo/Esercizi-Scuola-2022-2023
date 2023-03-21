import java.util.ArrayList;


public class Cartella {
    private ArrayList<Integer> numeri = new ArrayList<Integer>();
    private int cartellaOrdinata[][] = new int[3][9];

    public Cartella(){
        for (int i = 0; i < 15; i++) {
            int numero = (int) (Math.random() * 90) + 1;
            while (numeri.contains(numero)) {
                numero = (int) (Math.random() * 90) + 1;
            }
            numeri.add(numero);

            int colonna = numero / 10;
            int cont = 0;
            for (int j = 0; j < numeri.size(); j++) {
                if (numeri.get(j) / 10 == colonna) {
                    cont++;
                }
            }
            if (cont > 3) {
                numeri.remove(i);
                i--;
            }
        }

        for (int i = 0; i < 15; i++) {
            int numero = numeri.get(i);
            int colonna = numero / 10;
            if (colonna == 9) {
                colonna--;
            }
            for (int j = 0; j < 3; j++) {
                int cont = 0;
                for(int l = 0; l < 9; l++) {
                    if (cartellaOrdinata[j][l] != 0) {
                        cont++;
                    }
                }
                if (cont < 5) {
                    if (cartellaOrdinata[j][colonna] == 0) {
                        cartellaOrdinata[j][colonna] = numero;
                        break;
                    }
                }
            }
        }
    }

    public void verNumero(int numero){
        int colonna = numero / 10;
        if (colonna == 9){
            colonna--;
        }
        for (int i = 0; i < 3; i++) {
            if (cartellaOrdinata[i][colonna] == numero) {
                cartellaOrdinata[i][colonna] = 1;
            }
        }
    }

    public int verVincita(Boolean verVincite[]){
        int cont = 0, vincita = -1, contTot = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (cartellaOrdinata[i][j] == -1) {
                    cont++;
                    contTot++;
                }
            }
            if(cont > 1 && verVincite[(cont - 1)] == false) {
                vincita = cont - 1;
                break;
            }
            cont = 0;
        }
        if(contTot == 15) {
            vincita = 0;
        }
        return vincita;
    }


    public void stampaCartella(){
        System.out.println("***********************************************");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for(int j = 0; j < 9; j++){
                if(cartellaOrdinata[i][j] == 0){
                    if (j == 0) {
                        System.out.print("   ");
                    } else {
                        System.out.print("    ");
                    }
                } else if (cartellaOrdinata[i][j] == 1) {
                    if (j == 0){
                        System.out.print(" # ");
                    } else {
                        System.out.print("  # ");
                    }
                } else {
                    System.out.print(" " + cartellaOrdinata[i][j] + " ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("***********************************************");
    }
}
