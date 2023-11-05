package ex1;

import java.util.Date;
import java.util.List;

/**
 * The type Raport sedinta.
 */
public class RaportSedinta implements Raport {
    private String motivSedinta;
    private Date dataSedinta;
    private List<String> subiecte;
    private List<String> minuteSedinta;
    private List<String> persoaneResponsabile;

    /**
     * Instantiates a new Raport sedinta.
     *
     * @param motivSedinta         the motiv sedinta
     * @param dataSedinta          the data sedinta
     * @param subiecte             the subiecte
     * @param minuteSedinta        the minute sedinta
     * @param persoaneResponsabile the persoane responsabile
     */
    public RaportSedinta(String motivSedinta, Date dataSedinta, List<String> subiecte, List<String> minuteSedinta, List<String> persoaneResponsabile) {
        this.motivSedinta = motivSedinta;
        this.dataSedinta = dataSedinta;
        this.subiecte = subiecte;
        this.minuteSedinta = minuteSedinta;
        this.persoaneResponsabile = persoaneResponsabile;
    }

    /**
     * @return  - titlul raportului
     *         Metoda returneaza titlul raportului
     *
     */
    @Override
    public String generareTitlu() {
        return "Motivul Ședinței: " + motivSedinta + "\nData Ședinței: " + dataSedinta;
    }

    /**
     * @return - continutul raportului
     *        Metoda returneaza continutul raportului
     */
    @Override
    public String generareContinut() {


        StringBuilder content = new StringBuilder("Subiecte Discutate:\n");
        for (String subiect : subiecte) {
            content.append(subiect).append("\n");
        }
        content.append("\nMinute Ședință:\n");
        for (String minuta : minuteSedinta) {
            content.append(minuta).append("\n");
        }
        return content.toString();
    }

    /**
     * @return - incheierea raportului
     *       Metoda returneaza incheierea raportului
     */
    @Override
    public String generareIncheiere() {
        StringBuilder conclusion = new StringBuilder("Responsabili pentru întocmirea raportului: ");
        for (String persoana : persoaneResponsabile) {
            conclusion.append(persoana).append(", ");
        }
        return conclusion.toString().replaceAll(", $", ""); // Remove the trailing comma and space
    }

    /**
     * Gets data sedinta.
     *
     * @return the data sedinta
     */
    public Date getDataSedinta() {
        return dataSedinta;
    }
}