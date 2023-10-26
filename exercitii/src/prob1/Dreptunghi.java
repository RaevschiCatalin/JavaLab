package prob1;

public class Dreptunghi extends Figura {
    private double lungime;
    private double latime;
    private Boolean isFilled;
    public Dreptunghi(double lungime, double latime, boolean isFilled) {
        this.lungime = lungime;
        this.latime = latime;
        this.isFilled = isFilled;
    }
    public Double getArea() {
        return lungime * latime;
    }
    public Double getPerimeter() {
        return 2 * (lungime + latime);
    }
    @Override
    public String toString() {
        return "Dreptunghi: lungime = " + lungime + ", latime = " + latime;
    }
}
