package ex1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RaportSedintaTest {

    @Test
    public void testGenerareTitlu() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dataSedinta = sdf.parse("20-10-2023");

        String motivSedinta = "Motiv Sedinta";
        List<String> subiecte = Arrays.asList("Subiect 1", "Subiect 2");
        List<String> minuteSedinta = Arrays.asList("Minuta 1", "Minuta 2");
        List<String> persoaneResponsabile = Arrays.asList("Persoana 1", "Persoana 2");

        RaportSedinta raport = new RaportSedinta(motivSedinta, dataSedinta, subiecte, minuteSedinta, persoaneResponsabile);

        String result = raport.generareTitlu();
        String expected = "Motivul Ședinței: Motiv Sedinta\nData Ședinței: Thu Oct 20 00:00:00 EEST 2023";

        assertEquals(expected, result);
    }

    @Test
    public void testGenerareContinut() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dataSedinta = sdf.parse("20-10-2023");

        String motivSedinta = "Motiv Sedinta";
        List<String> subiecte = Arrays.asList("Subiect 1", "Subiect 2");
        List<String> minuteSedinta = Arrays.asList("Minuta 1", "Minuta 2");
        List<String> persoaneResponsabile = Arrays.asList("Persoana 1", "Persoana 2");

        RaportSedinta raport = new RaportSedinta(motivSedinta, dataSedinta, subiecte, minuteSedinta, persoaneResponsabile);

        String result = raport.generareContinut();
        String expected = "Subiecte Discutate:\nSubiect 1\nSubiect 2\n\nMinute Ședință:\nMinuta 1\nMinuta 2\n";

        assertEquals(expected, result);
    }

    @Test
    public void testGenerareIncheiere() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dataSedinta = sdf.parse("20-10-2023");

        String motivSedinta = "Motiv Sedinta";
        List<String> subiecte = Arrays.asList("Subiect 1", "Subiect 2");
        List<String> minuteSedinta = Arrays.asList("Minuta 1", "Minuta 2");
        List<String> persoaneResponsabile = Arrays.asList("Persoana 1", "Persoana 2");

        RaportSedinta raport = new RaportSedinta(motivSedinta, dataSedinta, subiecte, minuteSedinta, persoaneResponsabile);

        String result = raport.generareIncheiere();
        String expected = "Responsabili pentru întocmirea raportului: Persoana 1, Persoana 2";

        assertEquals(expected, result);
    }
}
