package strings;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {

    @Test
    public void testAreAnagrams_successful() {
        assertTrue(Anagrams.areAnagrams("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_nullInput() {
        assertFalse(Anagrams.areAnagrams(null, "test"));
        assertFalse(Anagrams.areAnagrams("test", null));
        assertFalse(Anagrams.areAnagrams(null, null));
    }

    @Test
    public void testAreAnagrams_differentLength() {
        assertFalse(Anagrams.areAnagrams("hello", "world"));
    }

    @Test
    public void testAreAnagrams_notAnagrams() {
        assertFalse(Anagrams.areAnagrams("hello", "holla"));
    }

    @Test
    public void testAreAnagrams_zeroInput() {
        assertTrue(Anagrams.areAnagrams("", ""));
    }
}
