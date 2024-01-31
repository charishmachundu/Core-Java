package functionalinterfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void testCalculateFactorial() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(3628800, FactorialCalculator.calculateFactorial(10));
    }
}
