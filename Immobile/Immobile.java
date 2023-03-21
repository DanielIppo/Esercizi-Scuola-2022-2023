package Immobile;

import java.util.Scanner;

public class Immobile {

    Scanner input = new Scanner(System.in);

    private String categoria;
    private int superficie, vestuta, valoreTot = 0;
    private int rValoreMq = 700, pValoreMq = 500, cValoreMq = 950;
    private int rV10_20 = 15, rVo20 = 27, pV10_20 = 10, pVo20 = 18, cV10_20 = 13, cVo20 = 22;

    public void init() {
        try{
            System.out.println("Scrivi la categoria dell'immobile(Residenziale, Pertinenza, Commerciale): ");
            categoria = input.nextLine();
            setCategoria(categoria.toLowerCase());
            System.out.println("Scrivi la superficie dell'immobile: ");
            superficie = input.nextInt();
            setSuperficie(superficie);
            System.out.println("Scrivi la percentuale di vestuta dell'immobile: ");
            vestuta = input.nextInt();
            setVestuta(vestuta);
        }catch(Exception e){
            System.out.println("Errore: " + e);
        }
    }

    private void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    private void setVestuta(int vestuta) {
        if(vestuta <= 30) {
            this.vestuta = vestuta;
        }
    }
    private void setCategoria(String cat) {
        if(cat.equals("residenziale") || cat.equals("pertinenza") || cat.equals("commerciale")) {
            this.categoria = cat;
        }
    }

    public int getValoreTot() {
        if (valoreTot == 0){
            setValoreTot();
        }
        return valoreTot;
    }

    private void setValoreTot() {
        int val = 0;
        if(categoria.equals("residenziale")) {
            val = (superficie * rValoreMq);
            val = calcCorrettivoVestuta(val); 
        } else if(categoria.equals("pertinenza")) {
            val = (superficie * pValoreMq);
            val = calcCorrettivoVestuta(val);
        } else if(categoria.equals("commerciale")) {
            val = (superficie * cValoreMq);
            val = calcCorrettivoVestuta(val);
        }
        valoreTot = val;
    }

    private int calcCorrettivoVestuta(int valore) {
        try{
            if(vestuta >= 10 && vestuta < 20) {
                if(categoria.equals("residenziale")) {
                    valore -= (valore/100) * rV10_20;
                } else if(categoria.equals("pertinenza")) {
                    valore -= (valore/100) * pV10_20;
                } else if(categoria.equals("commerciale")) {
                    valore -= (valore/100) * cV10_20;
                }
            } else if(vestuta >= 20 && vestuta <= 30) {
                if(categoria.equals("residenziale")) {
                    valore -= (valore/100) * rVo20;
                } else if(categoria.equals("pertinenza")) {
                    valore -= (valore/100) * pVo20;
                } else if(categoria.equals("commerciale")) {
                    valore -= (valore/100) * cVo20;
                }
            }
            return valore;
        } catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

    public int getTasseRegistro() {
        if(valoreTot == 0){
            setValoreTot();
        }
        try{
            return (valoreTot * 6) / 100;
        }catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

    public int getCanoneAffitto() {
        if(valoreTot == 0){
            setValoreTot();
        }
        try{
            if(categoria.equals("residenziale") || categoria.equals("pertinenza")) {
                return superficie * 7;
            } else if(categoria.equals("commerciale")) {
                return superficie * 9;
            } else {
                return 0;
            }
        }catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

}