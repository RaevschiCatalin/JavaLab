package ex1;

import java.util.List;

/**
 * The type Articol stiintific.
 */
public class ArticolStiintific implements Raport{
    private String titluArticol;
    private List<String> autori;
    private List<Sectiune> sectiuni;
    private String bibliografie;

    /**
     * Instantiates a new Articol stiintific.
     *
     * @param titluArticol the titlu articol
     * @param autori       the autori
     * @param sectiuni     the sectiuni
     * @param bibliografie the bibliografie
     */
    public ArticolStiintific(String titluArticol, List<String> autori, List<Sectiune> sectiuni, String bibliografie) {
        this.titluArticol = titluArticol;
        this.autori = autori;
        this.sectiuni = sectiuni;
        this.bibliografie = bibliografie;
    }

    /**
     * @return titluArticol - titlul articolului
     * Metoda returneaza titlul articolului
     */
    @Override
    public String generareTitlu(){
        StringBuilder title = new StringBuilder();
        title.append("Titlu: ").append(titluArticol).append("\nAutori: ");
        for (String autor : autori) {
            title.append(autor).append(", ");
        }
        return title.toString();
    }

    /**
     * @return content - continutul articolului
     * Metoda returneaza continutul articolului
     */
    @Override
    public String generareContinut(){
        StringBuilder content = new StringBuilder("Secțiuni:\n");
        for (Sectiune secțiune : sectiuni) {
            content.append(secțiune.getTitlu()).append("\n").append(secțiune.getContinut()).append("\n");
        }
        return content.toString();
    }

    /**
     * @return bibliografie - bibliografia articolului
     * Metoda returneaza bibliografia articolului
     */
    @Override
    public String generareIncheiere(){
        return "Bibliografie: " + bibliografie;
    }
}
