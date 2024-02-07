package functionalinterfaces;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ArrayListReverserTest {
    @Test
    public void testReverseArrayList() {
        // Test case 1: Integer ArrayList
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        ArrayListReverser.reverseArrayList(intList);
        assertArrayEquals(new Integer[]{4, 3, 2, 1}, intList.toArray());

        // Test case 2: String ArrayList
        ArrayList<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("orange");
        ArrayListReverser.reverseArrayList(strList);
        assertArrayEquals(new String[]{"orange", "banana", "apple"}, strList.toArray());

        // Test case 3: Empty ArrayList
        ArrayList<Object> emptyList = new ArrayList<>();
        ArrayListReverser.reverseArrayList(emptyList);
        assertTrue(emptyList.isEmpty());

        // Test case 4: ArrayList with a single element
        ArrayList<Character> singleElementList = new ArrayList<>();
        singleElementList.add('A');
        ArrayListReverser.reverseArrayList(singleElementList);
        assertArrayEquals(new Character[]{'A'}, singleElementList.toArray());
    }
}
