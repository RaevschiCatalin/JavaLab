package ex;
import java.util.List;

/**
 * The type Muzical.
 */
public class Muzical extends Film {
    private List<Actor> actori;

    /**
     * Instantiates a new Muzical.
     *
     * @param titlu   the titlu
     * @param regizor the regizor
     * @param buget   the buget
     * @param actori  the actori
     */
    public Muzical(String titlu, String regizor, double buget, List<Actor> actori) {
        super(titlu, regizor, buget);
        this.actori = actori;
    }

    /**
     * Gets actori.
     *
     * @return the actori
     */
    public List<Actor> getActori() {
        return actori;
    }

    /**
     * Sets actori.
     *
     * @param actori the actori
     */
    public void setActori(List<Actor> actori) {
        this.actori = actori;
    }
    @Override
    public String toString() {
        return "Muzical [actori=" + actori + "]";
    }

}
