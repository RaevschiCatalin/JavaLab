package ex1;

/**
 * The type Flamingo.
 */
public class Flamingo extends Animal{
    private String culoare;

    /**
     * Instantiates a new Flamingo.
     *
     * @param nume    the nume
     * @param culoare the culoare
     */
    public Flamingo(String nume, String culoare) {
        super(nume);
        this.culoare = culoare;
    }

    /**
     * Gets culoare.
     *
     * @return the culoare
     */
    public String getCuloare() {
        return culoare;
    }
}
