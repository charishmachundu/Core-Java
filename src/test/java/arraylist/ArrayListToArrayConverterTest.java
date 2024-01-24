package arraylist;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ArrayListToArrayConverterTest {

    @Test
    public void testConvertToArray() {
        // Create an ArrayList and add elements
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Element 1");
        testList.add("Element 2");
        testList.add("Element 3");

        // Run the convertToArray method
        String[] resultArray = ArrayListToArrayConverter.convertToArray(testList);

        // Verify the converted Array
        String[] expectedArray = {"Element 1", "Element 2", "Element 3"};
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testConvertToArrayEmptyList() {
        // Create an empty ArrayList
        ArrayList<String> emptyList = new ArrayList<>();

        // Run the convertToArray method on an empty list
        String[] resultArray = ArrayListToArrayConverter.convertToArray(emptyList);

        // Verify the converted Array (should be an empty array)
        String[] expectedArray = {};
        assertArrayEquals(expectedArray, resultArray);
    }
}

