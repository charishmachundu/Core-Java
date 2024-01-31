package functionalinterfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueWordCounterTest {
    @Test
    public void testCountUniqueWords() {
        assertEquals(3, UniqueWordCounter.countUniqueWords("java is java programming language"));
        assertEquals(5, UniqueWordCounter.countUniqueWords("hello world Hello WORLD!"));
        assertEquals(1, UniqueWordCounter.countUniqueWords("apple"));
    }
}
