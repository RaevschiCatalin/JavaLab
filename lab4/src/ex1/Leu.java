package ex1;

/**
 * The type Leu.
 */
public class Leu extends Animal{
    private String culoareBlana;

    /**
     * Instantiates a new Leu.
     *
     * @param nume         the nume
     * @param culoareBlana the culoare blana
     */
    public Leu(String nume, String culoareBlana) {
        super(nume);
        this.culoareBlana = culoareBlana;
    }

    /**
     * Gets culoare blana.
     *
     * @return the culoare blana
     */
    public String getCuloareBlana() {
        return culoareBlana;
    }
}
