public class Main {

    static Persona p1 = new Persona("Mario", "Rossi", "M", "Bisex", "Roma", "Biondo", 20, 1.80f, 80.0f);
    static Persona p2 = new Persona("Giulia", "Bianchi", "M", "Lesbica", "Milano", "Castano", 19, 1.70f, 60.0f);
    public static void main(String[] args) {
        p1.showData();
        System.out.println("***********************************************");
        p2.showData();
    }
}