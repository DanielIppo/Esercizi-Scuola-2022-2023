public class Cilindro extends Oggetto3D {
    private double area;
    private double altezza;
    public Cilindro(double area, double altezza) {
        this.area = area;
        this.altezza = altezza;
    }
    public double volume() {
        return area * altezza;
    }
}