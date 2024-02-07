package functionalinterfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumCalculatorTest {
    @Test
    public void testCalculateArraySum() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySumCalculator.calculateArraySum(array1));

        int[] array2 = {10, -5, 7, 2};
        assertEquals(14, ArraySumCalculator.calculateArraySum(array2));

        int[] array3 = {0, 0, 0, 0};
        assertEquals(0, ArraySumCalculator.calculateArraySum(array3));

        int[] array4 = {-1, -2, -3, -4, -5};
        assertEquals(-15, ArraySumCalculator.calculateArraySum(array4));
    }
}

