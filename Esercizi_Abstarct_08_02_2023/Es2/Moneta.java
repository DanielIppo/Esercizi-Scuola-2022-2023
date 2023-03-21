public class Moneta{
    public String lanciaMoneta(){
        int numero = (int)(Math.random()*2);
        if(numero == 0){
            return "testa";
        }else{
            return "croce";
        }
    }
}