package ex;

/**
 * The type Documentar.
 */
public class Documentar extends Film {
    private int numarEpisoade;
    private String descriereSubiect;

    /**
     * Instantiates a new Documentar.
     *
     * @param titlu            the titlu
     * @param regizor          the regizor
     * @param buget            the buget
     * @param numarEpisoade    the numar episoade
     * @param descriereSubiect the descriere subiect
     */
    public Documentar(String titlu, String regizor, double buget, int numarEpisoade, String descriereSubiect) {
        super(titlu, regizor, buget);
        this.numarEpisoade = numarEpisoade;
        this.descriereSubiect = descriereSubiect;
    }

    /**
     * Gets numar episoade.
     *
     * @return the numar episoade
     */
    public int getNumarEpisoade() {
        return numarEpisoade;
    }

    /**
     * Sets numar episoade.
     *
     * @param numarEpisoade the numar episoade
     */
    public void setNumarEpisoade(int numarEpisoade) {
        this.numarEpisoade = numarEpisoade;
    }

    /**
     * Gets descriere subiect.
     *
     * @return the descriere subiect
     */
    public String getDescriereSubiect() {
        return descriereSubiect;
    }

    /**
     * Sets descriere subiect.
     *
     * @param descriereSubiect the descriere subiect
     */
    public void setDescriereSubiect(String descriereSubiect) {
        this.descriereSubiect = descriereSubiect;
    }
    @Override
    public String toString() {
        return "Documentar{" +
                "numarEpisoade=" + numarEpisoade +
                ", descriereSubiect='" + descriereSubiect + '\'' +
                '}';
    }



}
