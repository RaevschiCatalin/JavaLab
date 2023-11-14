package ex1;

/**
 * The type Strut.
 */
public class Strut extends Animal{
    private double viteza;

    /**
     * Instantiates a new Strut.
     *
     * @param nume   the nume
     * @param viteza the viteza
     */
    public Strut(String nume, double viteza) {
        super(nume);
        this.viteza = viteza;
    }

    /**
     * Gets viteza.
     *
     * @return the viteza
     */
    public double getViteza() {
        return viteza;
    }
}
