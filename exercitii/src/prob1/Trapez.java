package prob1;

public class Trapez extends Figura {
    private double baza1;
    private double baza2;
    private double inaltime;
    private Boolean isFilled;

    public Trapez(double baza1, double baza2, double inaltime, boolean isFilled) {
        this.baza1 = baza1;
        this.baza2 = baza2;
        this.inaltime = inaltime;
        this.isFilled = isFilled;
    }
    public Double getArea() {
        return (baza1 + baza2) * inaltime / 2;
    }
    public Double getPerimeter() {
        return baza1 + baza2 + 2 * Math.sqrt(Math.pow((baza1 - baza2) / 2, 2) + Math.pow(inaltime, 2));
    }
    @Override
    public String toString() {
        return "Trapez: baza1 = " + baza1 + ", baza2 = " + baza2 + ", inaltime = " + inaltime;
    }

}
