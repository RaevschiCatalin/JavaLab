package ex1;

/**
 * The type Sectiune.
 */
public class Sectiune {
    private String titlu;
    private String continut;

    /**
     * Instantiates a new Sectiune.
     *
     * @param titlu    the titlu
     * @param continut the continut
     */
    public Sectiune(String titlu, String continut){
        this.titlu = titlu;
        this.continut = continut;
    }

    /**
     * Get titlu string.
     *
     * @return the string
     */
    public String getTitlu(){
        return titlu;
    }

    /**
     * Get continut string.
     *
     * @return the string
     */
    public String getContinut(){
        return continut;
    }
}
