package lambda;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MaxElementFinderTest {

    @Test
    public void testFindMaxElement() {
        List<String> inputList = Arrays.asList("apple", "orange", "banana", "grape");

        String result = MaxElementFinder.findMaxElement(inputList);

        assertEquals("orange", result);
    }

    @Test
    public void testFindMaxElementEmptyList() {
        List<String> emptyList = Arrays.asList();

        String result = MaxElementFinder.findMaxElement(emptyList);

        assertEquals(null, result);
    }

    @Test
    public void testFindMaxElementSingleElement() {
        List<String> singleElementList = Arrays.asList("apple");

        String result = MaxElementFinder.findMaxElement(singleElementList);

        assertEquals("apple", result);
    }
}
