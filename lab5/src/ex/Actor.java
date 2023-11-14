package ex;

/**
 * The type Actor.
 */
public class Actor {
    private String nume;
    private String abilitatiDans;
    private String abilitatiCantat;

    /**
     * Instantiates a new Actor.
     *
     * @param nume            the nume
     * @param abilitatiDans   the abilitati dans
     * @param abilitatiCantat the abilitati cantat
     */
    public Actor(String nume, String abilitatiDans, String abilitatiCantat) {
        this.nume = nume;
        this.abilitatiDans = abilitatiDans;
        this.abilitatiCantat = abilitatiCantat;
    }

    /**
     * Gets nume.
     *
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * Gets abilitati dans.
     *
     * @return the abilitati dans
     */
    public String getAbilitatiDans() {
        return abilitatiDans;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", abilitatiDans='" + abilitatiDans + '\'' +
                ", abilitatiCantat='" + abilitatiCantat + '\'' +
                '}';
    }

    /**
     * Instantiates a new Actor.
     *
     * @param abilitatiDans the abilitati dans
     */
    public Actor(String abilitatiDans) {
        this.abilitatiDans = abilitatiDans;
    }

    /**
     * Sets abilitati cantat.
     *
     * @param abilitatiCantat the abilitati cantat
     */
    public void setAbilitatiCantat(String abilitatiCantat) {
        this.abilitatiCantat = abilitatiCantat;
    }

    /**
     * Sets abilitati dans.
     *
     * @param abilitatiDans the abilitati dans
     */
    public void setAbilitatiDans(String abilitatiDans) {
        this.abilitatiDans = abilitatiDans;
    }

    /**
     * Sets nume.
     *
     * @param nume the nume
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * Gets abilitati cantat.
     *
     * @return the abilitati cantat
     */
    public String getAbilitatiCantat() {
        return abilitatiCantat;
    }
}


