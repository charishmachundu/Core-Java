package lambda;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SumOfSquaresTest {

    @Test
    public void testSumOfSquares() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);

        int result = SumOfSquares.sumOfSquares(inputList);

        assertEquals(55, result);
    }

    @Test
    public void testSumOfSquaresEmptyList() {
        List<Integer> emptyList = Arrays.asList();

        int result = SumOfSquares.sumOfSquares(emptyList);

        assertEquals(0, result);
    }

    @Test
    public void testSumOfSquaresNoPositiveIntegers() {
        List<Integer> negativeNumbersList = Arrays.asList(-1, -2, -3, -4, -5);

        int result = SumOfSquares.sumOfSquares(negativeNumbersList);

        assertEquals(0, result);
    }
}

