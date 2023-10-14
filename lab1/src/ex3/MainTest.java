package ex3;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testContourSizeWithValidMatrix() {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int result = Main.getContourSize(matrix);
        assertEquals(1, result);
    }

    @Test
    public void testContourSizeWithInvalidMatrix() {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 2}, 
            {1, 1, 1}
        };
        int result = Main.getContourSize(matrix);
        assertEquals(0, result);
    }
}





