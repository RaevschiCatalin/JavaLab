package ex1;

/**
 * The type Elefant.
 */
public class Elefant extends Animal{
    private double lungimeTrompa;

    /**
     * Instantiates a new Elefant.
     *
     * @param nume          the nume
     * @param lungimeTrompa the lungime trompa
     */
    public Elefant(String nume, double lungimeTrompa) {
        super(nume);
        this.lungimeTrompa = lungimeTrompa;
    }

    /**
     * Gets lungime trompa.
     *
     * @return the lungime trompa
     */
    public double getLungimeTrompa() {
        return lungimeTrompa;
    }
}
