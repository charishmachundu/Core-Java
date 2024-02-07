package lambda;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StringGrouperTest {

    @Test
    public void testGroupByLength() {
        List<String> stringList = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");

        Map<Integer, List<String>> result = StringGrouper.groupByLength(stringList);

        assertEquals(2, result.get(5).size()); // Strings with length 5: apple, grape
        assertEquals(2, result.get(6).size()); // Strings with length 6: banana, orange
        assertEquals(1, result.get(4).size()); // Strings with length 4: kiwi
    }

    @Test
    public void testGroupByLengthWithEmptyList() {
        List<String> emptyList = Arrays.asList();

        Map<Integer, List<String>> result = StringGrouper.groupByLength(emptyList);

        assertEquals(0, result.size()); // The result map should be empty for an empty list
    }
}

