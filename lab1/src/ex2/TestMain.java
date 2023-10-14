package ex2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testRemoveConsecutiveDuplicates() {
        assertEquals("aba.metalica", Main.removeConsecutiveDuplicates("abba...metttallica"));
        assertEquals("abc", Main.removeConsecutiveDuplicates("aabbcc"));
        assertEquals("a", Main.removeConsecutiveDuplicates("aaaaaaa"));
        assertEquals("", Main.removeConsecutiveDuplicates(""));
    }
}
