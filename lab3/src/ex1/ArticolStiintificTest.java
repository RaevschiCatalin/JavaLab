package ex1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArticolStiintificTest {

    @Test
    public void testGenerareTitlu() {
        String titluArticol = "Titlu Articol";
        List<String> autori = Arrays.asList("Autor 1", "Autor 2");
        List<Sectiune> sectiuni = Arrays.asList(new Sectiune("Titlu Sectiune", "Continut Sectiune"));
        String bibliografie = "Bibliografie";

        ArticolStiintific articol = new ArticolStiintific(titluArticol, autori, sectiuni, bibliografie);

        String result = articol.generareTitlu();
        String expected = "Titlu: Titlu Articol\nAutori: Autor 1, Autor 2, ";

        assertEquals(expected, result);
    }

    @Test
    public void testGenerareContinut() {
        String titluArticol = "Titlu Articol";
        List<String> autori = Arrays.asList("Autor 1", "Autor 2");
        List<Sectiune> sectiuni = Arrays.asList(new Sectiune("Titlu Sectiune", "Continut Sectiune"));
        String bibliografie = "Bibliografie";

        ArticolStiintific articol = new ArticolStiintific(titluArticol, autori, sectiuni, bibliografie);

        String result = articol.generareContinut();
        String expected = "Secțiuni:\nTitlu Sectiune\nContinut Sectiune\n";

        assertEquals(expected, result);
    }

    @Test
    public void testGenerareIncheiere() {
        String titluArticol = "Titlu Articol";
        List<String> autori = Arrays.asList("Autor 1", "Autor 2");
        List<Sectiune> sectiuni = Arrays.asList(new Sectiune("Titlu Sectiune", "Continut Sectiune"));
        String bibliografie = "Bibliografie";

        ArticolStiintific articol = new ArticolStiintific(titluArticol, autori, sectiuni, bibliografie);

        String result = articol.generareIncheiere();
        String expected = "Bibliografie: Bibliografie";

        assertEquals(expected, result);
    }
}
