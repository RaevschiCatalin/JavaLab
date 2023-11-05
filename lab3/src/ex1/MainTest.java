package ex1;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testNumarArticole() {
        List<Raport> rapoarte = new ArrayList<>();
        rapoarte.add(new ArticolStiintific("Titlu Articol", Arrays.asList("Autor 1", "Autor 2"), Arrays.asList(new Sectiune("Titlu Sectiune", "Continut Sectiune")), "Bibliografie"));
        rapoarte.add(new RaportSedinta("Motiv Sedinta", new Date(), Arrays.asList("Subiect 1", "Subiect 2"), Arrays.asList("Minuta 1", "Minuta 2"), Arrays.asList("Persoana 1", "Persoana 2")));

        int result = Main.numarArticole(rapoarte);

        assertEquals(1, result); // Verify that there's 1 scientific article in the list
    }

    @Test
    public void testDataMaximaSedinte() {
        List<Raport> rapoarte = new ArrayList<>();
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() - 86400000); // One day ago
        rapoarte.add(new RaportSedinta("Motiv Sedinta", date1, Arrays.asList("Subiect 1", "Subiect 2"), Arrays.asList("Minuta 1", "Minuta 2"), Arrays.asList("Persoana 1", "Persoana 2")));
        rapoarte.add(new RaportSedinta("Motiv Sedinta 2", date2, Arrays.asList("Subiect 1", "Subiect 2"), Arrays.asList("Minuta 1", "Minuta 2"), Arrays.asList("Persoana 1", "Persoana 2")));

        Date result = Main.dataMaximaSedinte(rapoarte);

        assertEquals(date1, result); // Verify that the most recent date is date1
    }
}