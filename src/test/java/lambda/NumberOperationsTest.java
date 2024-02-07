package lambda;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NumberOperationsTest {

    @Test
    public void testFilterAndDouble() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = NumberOperations.filterAndDouble(inputList);

        assertEquals(Arrays.asList(2, 6, 10, 14, 18), result);
    }

    @Test
    public void testFilterAndDoubleEmptyList() {
        List<Integer> emptyList = Arrays.asList();

        List<Integer> result = NumberOperations.filterAndDouble(emptyList);

        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testFilterAndDoubleNoOddNumbers() {
        List<Integer> evenNumbersList = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> result = NumberOperations.filterAndDouble(evenNumbersList);

        assertEquals(Arrays.asList(), result);
    }
}
