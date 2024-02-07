package lambda;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;


public class StringSortTest {

    @Test
    public void testSortStrings() {
        String[] strings = {"apple", "banana", "kiwi", "orange"};
        String[] expected = {"kiwi", "apple", "orange", "banana"};

        StringSort.sortStrings(strings);

        assertArrayEquals(expected, strings);
    }
}