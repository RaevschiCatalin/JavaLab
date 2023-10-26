package ex1;

import ex1.Magazin;
import ex1.Main;
import ex1.Mobila;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testCelMaiIeftin() {
        Magazin[] magazine = new Magazin[3];

        magazine[0] = new Magazin("Magazin1", "Adresa1", 10);
        magazine[1] = new Magazin("Magazin2", "Adresa2", 10);
        magazine[2] = new Magazin("Magazin3", "Adresa3", 10);

        magazine[0].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[0].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 10));

        magazine[1].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[1].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 40));

        magazine[2].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[2].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 5));

        String expected = "Magazin3";
        String result = Main.celMaiIeftin(magazine);

        assertEquals(expected, result);
    }

    @Test
    public void testNumaraCuvinte() {
        Magazin[] magazine = new Magazin[3];

        magazine[0] = new Magazin("Magazin1", "Adresa1", 10);
        magazine[1] = new Magazin("Magazin2", "Adresa2", 10);
        magazine[2] = new Magazin("Magazin3", "Adresa3", 10);

        magazine[0].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[0].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 10));

        magazine[1].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[1].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 40));

        magazine[2].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[2].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 5));

        String[] cuvinte = {"bucatarie", "scaun"};
        int expected = 9;
        int result = Main.numaraCuvinte(magazine, cuvinte);

        assertEquals(expected, result);
    }
}
