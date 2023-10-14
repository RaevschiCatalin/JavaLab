package ex1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
	@Test
	public void testIsKSpecialValidKSpecial() {
	    int[] validKSpecial = {1, 0, 1, 0, 1};
	    assertTrue(Main.isKSpecial(validKSpecial, validKSpecial.length));
	}

    @Test
    public void testIsKSpecialValidNotKSpecial() {
        int[] validNotKSpecial = {1, 0, 1, 0, 0, 1};
        assertFalse(Main.isKSpecial(validNotKSpecial, validNotKSpecial.length));
    }

    @Test
    public void testIsKSpecialValidEdgeCase() {
        int[] validEdgeCase = {1};
        assertTrue(Main.isKSpecial(validEdgeCase, validEdgeCase.length));
    }

    @Test
    public void testIsKSpecialInvalidStartsWithZero() {
        int[] invalidStartsWithZero = {0, 1, 0, 1};
        assertFalse(Main.isKSpecial(invalidStartsWithZero, invalidStartsWithZero.length));
    }

    @Test
    public void testIsKSpecialInvalidMultipleConsecutiveZeros() {
        int[] invalidConsecutiveZeros = {1, 0, 0, 1};
        assertFalse(Main.isKSpecial(invalidConsecutiveZeros, invalidConsecutiveZeros.length));
    }

    @Test
    public void testIsKSpecialInvalidOtherCharacters() {
        int[] invalidOtherCharacters = {1, 2, 0, 1};
        assertFalse(Main.isKSpecial(invalidOtherCharacters, invalidOtherCharacters.length));
    }
}

