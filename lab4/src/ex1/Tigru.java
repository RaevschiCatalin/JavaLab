package ex1;

/**
 * The type Tigru.
 */
public class Tigru extends Animal{
    private int numarDungi;

    /**
     * Instantiates a new Tigru.
     *
     * @param nume       the nume
     * @param numarDungi the numar dungi
     */
    public Tigru(String nume, int numarDungi) {
        super(nume);
        this.numarDungi = numarDungi;
    }

    /**
     * Gets numar dungi.
     *
     * @return the numar dungi
     */
    public int getNumarDungi() {
        return numarDungi;
    }
}
