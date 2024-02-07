package lambda;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;


public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        List<String> input = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Grapes");
        List<String> expected = Arrays.asList("Apple", "Apricot");

        List<String> result = StringFilter.filterStringsStartingWithA(input, s -> s.startsWith("A"));

        assertEquals(expected, result);
    }
}