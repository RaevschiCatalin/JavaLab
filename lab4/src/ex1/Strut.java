package ex1;

public class Strut extends Animal{
    private double viteza;

    public Strut(String nume, double viteza) {
        super(nume);
        this.viteza = viteza;
    }

    public double getViteza() {
        return viteza;
    }
}
