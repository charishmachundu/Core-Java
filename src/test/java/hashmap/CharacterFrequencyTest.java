package hashmap;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyTest {

    @Test
    public void testPrintCharacterFrequency() {
        String input = "test string";

        // Test Case 1: Valid input
        Map<Character, Integer> expected1 = new HashMap<>();
        expected1.put('t', 3);
        expected1.put('e', 1);
        expected1.put('s', 2);
        expected1.put('r', 1);
        expected1.put('i', 1);
        expected1.put('n', 1);
        expected1.put('g', 1);
        assertEquals(expected1, CharacterFrequency.printCharacterFrequency(input));

        // Test Case 2: Empty input
        String emptyInput = "";
        Map<Character, Integer> expected2 = new HashMap<>();
        assertEquals(expected2, CharacterFrequency.printCharacterFrequency(emptyInput));

        // Test Case 3: Input with spaces
        String inputWithSpaces = "   test string   ";
        Map<Character, Integer> expected3 = new HashMap<>();
        expected3.put('t', 3);
        expected3.put('e', 1);
        expected3.put('s', 2);
        expected3.put('r', 1);
        expected3.put('i', 1);
        expected3.put('n', 1);
        expected3.put('g', 1);
        assertEquals(expected3, CharacterFrequency.printCharacterFrequency(inputWithSpaces));
    }
}
