package lambda;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class StringManipulatorTest {
    @Test
    public void testCapitalizeAndSort() {
        String[] input1 = {"apple", "Banana", "orange", "grape", "Peach"};
        String[] expected1 = {"Apple", "Banana", "Grape", "Orange", "Peach"};
        assertArrayEquals(expected1, StringManipulator.capitalizeAndSort(input1));

        String[] input2 = {"dog", "cat", "Elephant", "tiger", "lion"};
        String[] expected2 = {"Cat", "Dog", "Elephant", "Lion", "Tiger"};
        assertArrayEquals(expected2, StringManipulator.capitalizeAndSort(input2));

        String[] input3 = {"java", "Python", "C++", "Ruby", "javascript"};
        String[] expected3 = {"C++", "Java", "Javascript", "Python", "Ruby"};
        assertArrayEquals(expected3, StringManipulator.capitalizeAndSort(input3));
    }
}
