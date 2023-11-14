package ex1;

import ex1.*;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The type Zoo test.
 */
public class ZooTest {

    /**
     * Test raport hrana per luna.
     */
    @Test
    public void testRaportHranaPerLuna() {
        Zoo gradinaZoologica = new Zoo("Gradina Zoologica Test");

        gradinaZoologica.adaugaAnimal(new Elefant("Elefant1", 2.5));
        gradinaZoologica.adaugaAnimal(new Tigru("Tigru1", 4));
        gradinaZoologica.adaugaAnimal(new Leu("Leu1", "Maro"));
        gradinaZoologica.adaugaAnimal(new Flamingo("Flamingo1", "Roz"));
        gradinaZoologica.adaugaAnimal(new Strut("Strut1", 1.8));

        // Test the generated food report
        assertEquals(1, gradinaZoologica.raportHranaPerLuna().get("Elefant").intValue());
        assertEquals(1, gradinaZoologica.raportHranaPerLuna().get("Tigru").intValue());
        assertEquals(1, gradinaZoologica.raportHranaPerLuna().get("Leu").intValue());
        assertEquals(1, gradinaZoologica.raportHranaPerLuna().get("Flamingo").intValue());
        assertEquals(1, gradinaZoologica.raportHranaPerLuna().get("Strut").intValue());
        assertNull(gradinaZoologica.raportHranaPerLuna().get("Vultur")); // Non-existent type

        // Add more animals of the same type and retest
        gradinaZoologica.adaugaAnimal(new Elefant("Elefant2", 3.0));
        gradinaZoologica.adaugaAnimal(new Elefant("Elefant3", 2.7));
        assertEquals(3L, gradinaZoologica.raportHranaPerLuna().get("Elefant").longValue());
    }

    /**
     * Test animale de tip.
     */
    @Test
    public void testAnimaleDeTip() {
        Zoo gradinaZoologica = new Zoo("Gradina Zoologica Test");

        gradinaZoologica.adaugaAnimal(new Elefant("Elefant1", 2.5));
        gradinaZoologica.adaugaAnimal(new Tigru("Tigru1", 4));
        gradinaZoologica.adaugaAnimal(new Leu("Leu1", "Maro"));
        gradinaZoologica.adaugaAnimal(new Flamingo("Flamingo1", "Roz"));
        gradinaZoologica.adaugaAnimal(new Strut("Strut1", 1.8));

        assertTrue(gradinaZoologica.animaleDeTip(Tigru.class).size() == 1);
        assertEquals("Tigru1", gradinaZoologica.animaleDeTip(Tigru.class).get(0).getNume());

        assertTrue(gradinaZoologica.animaleDeTip(Elefant.class).size() == 1);
        assertEquals("Elefant1", gradinaZoologica.animaleDeTip(Elefant.class).get(0).getNume());

        assertTrue(gradinaZoologica.animaleDeTip(Leu.class).size() == 1);
        assertEquals("Leu1", gradinaZoologica.animaleDeTip(Leu.class).get(0).getNume());


    }
}

