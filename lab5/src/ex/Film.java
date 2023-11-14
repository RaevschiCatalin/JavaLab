package ex;

/**
 * The type Film.
 */
public class Film {
    private String titlu;
    private String regizor;
    private double buget;

    /**
     * Instantiates a new Film.
     *
     * @param titlu   the titlu
     * @param regizor the regizor
     * @param buget   the buget
     */
    public Film(String titlu, String regizor, double buget) {
        this.titlu = titlu;
        this.regizor = regizor;
        this.buget = buget;
    }

    /**
     * Instantiates a new Film.
     */
    public Film(){
        this.titlu = "";
        this.regizor = "";
        this.buget = 0;
    }

    /**
     * Gets titlu.
     *
     * @return the titlu
     */
    public String getTitlu() {
        return titlu;
    }

    /**
     * Gets regizor.
     *
     * @return the regizor
     */
    public String getRegizor() {
        return regizor;
    }

    /**
     * Gets buget.
     *
     * @return the buget
     */
    public double getBuget() {
        return buget;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titlu='" + titlu + '\'' +
                ", regizor='" + regizor + '\'' +
                ", buget=" + buget +
                '}';
    }

    /**
     * Sets regizor.
     *
     * @param regizor the regizor
     */
    public void setRegizor(String regizor) {
        this.regizor = regizor;
    }

    /**
     * Sets buget.
     *
     * @param buget the buget
     */
    public void setBuget(double buget) {
        this.buget = buget;
    }

    /**
     * Instantiates a new Film.
     *
     * @param titlu the titlu
     */
    public Film(String titlu) {
        this.titlu = titlu;
    }

    /**
     * Sets titlu.
     *
     * @param titlu the titlu
     */
    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
}
