package prob1;

public class Cerc extends Figura {
    private double raza;
    private Boolean isFilled;
    public Cerc(double raza,boolean isFilled) {
        this.raza = raza;
        this.isFilled = isFilled;
    }
    public Double getArea() {
        return Math.PI * raza * raza;
    }
    public Double getPerimeter() {
        return 2 * Math.PI * raza;
    }
    @Override
    public String toString() {
        return "Cerc: raza = " + raza;
    }
}
