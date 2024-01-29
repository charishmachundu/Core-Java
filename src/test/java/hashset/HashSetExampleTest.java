package hashset;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import org.junit.Test;

public class HashSetExampleTest {

    @Test
    public void testHashSetIteration() {
        HashSet<String> testHashSet = new HashSet<>();
        testHashSet.add("Test1");
        testHashSet.add("Test2");
        testHashSet.add("Test3");

        StringBuilder result = new StringBuilder();
        for (String str : testHashSet) {
            result.append(str);
        }

        // Check if the expected result contains the actual result and vice versa
        assertTrue(result.toString().contains("Test1"));
        assertTrue(result.toString().contains("Test2"));
        assertTrue(result.toString().contains("Test3"));
    }
}


