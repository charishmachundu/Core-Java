package strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class VowelsTest {

	    @Test
	    public void testCountVowels() {
	        assertEquals(2, Vowels.countVowels("Hello"));
	    }

	    @Test
	    public void testCountVowelsCaseInsensitive() {
	        assertEquals(3, Vowels.countVowels("Programming"));
	    }

	    @Test
	    public void testCountVowelsEmptyString() {
	        assertEquals(0, Vowels.countVowels(""));
	    }

	    @Test
	    public void testCountVowelsNullString() {
	        assertEquals(0, Vowels.countVowels(null));
	    }

}