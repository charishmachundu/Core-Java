package arraylist;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class RemoveLastObjectTest {

    @Test
    public void testRemoveLastElement() {
        // Create an ArrayList and add elements
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Element 1");
        testList.add("Element 2");
        testList.add("Element 3");

        // Run the removeLastElement method
        RemoveLastObject.removeLastElement(testList);

        // Verify the ArrayList after removal
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Element 1");
        expectedList.add("Element 2");

        assertEquals(expectedList, testList);
    }

    @Test
    public void testRemoveLastElementEmptyList() {
        // Create an empty ArrayList
        ArrayList<String> emptyList = new ArrayList<>();

        // Run the removeLastElement method on an empty list
        RemoveLastObject.removeLastElement(emptyList);

        // Verify the ArrayList after removal (should remain empty)
        assertTrue(emptyList.isEmpty());
    }
}
