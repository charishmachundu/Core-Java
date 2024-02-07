package lambda;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathOperationTest {
    
    @Test
    public void testAddition() {
        MathOperation addition = (a, b) -> a + b;

        int result1 = addition.operate(5, 3);
        int result2 = addition.operate(-2, 8);

        assertEquals(8, result1);
        assertEquals(6, result2);
    }
}
