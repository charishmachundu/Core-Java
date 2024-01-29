package hashset;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        String result = RemoveDuplicates.removeDuplicates("programming");

        // Check if the result contains the expected characters
        assertTrue(result.contains("p"));
        assertTrue(result.contains("r"));
        assertTrue(result.contains("o"));
        assertTrue(result.contains("g"));
        assertTrue(result.contains("a"));
        assertTrue(result.contains("m"));
        assertTrue(result.contains("i"));
        assertTrue(result.contains("n"));
    }
}
