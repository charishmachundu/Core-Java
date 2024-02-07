package lambda;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageOfSquaresTest {
    @Test
    public void testAverageOfSquaresOfOddNumbers() {
        // Test case: Average of squares of odd numbers in {1, 2, 3, 4, 5, 6, 7, 8, 9}
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double expectedOutput = (1.0 + 9.0 + 25.0 + 49.0 + 81.0) / 5.0; // Expected average: 33.0/5.0 = 6.6

        assertEquals(expectedOutput, AverageOfSquares.averageOfSquaresOfOddNumbers(input), 0.001);
    }
}
