package ex;

import org.junit.Test;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testExtrageFilmeMuzicaleCuMaiPutiniActori() {
        List<Film> listaFilme = Main.creareListaFilme();
        List<Film> rezultat = Main.extrageFilmeMuzicaleCuMaiPutiniActori(listaFilme, 3);

        assertEquals(1, rezultat.size());
        assertEquals("Muzical2", rezultat.get(0).getTitlu());
        assertTrue(rezultat.get(0) instanceof Muzical);
    }

    @Test
    public void testNumaraDocumentareCuCuvinteInDescriere() {
        List<Film> listaFilme = Main.creareListaFilme();
        int rezultat = Main.numaraDocumentareCuCuvinteInDescriere(listaFilme, "documentar", "istorie");

        assertEquals(2, rezultat);
    }


    @Test
    public void testSortareListaFilme() {
        List<Film> listaFilme = Main.creareListaFilme();
        Main.sortareListaFilme(listaFilme);

        assertEquals("Documentar2", listaFilme.get(0).getTitlu());
        assertTrue(listaFilme.get(0) instanceof Documentar);
    }

}