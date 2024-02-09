package functionalinterfaces;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class RepeatedDigitsFinderTest {

    @Test
    public void testFindRepeatedDigits_PositiveCase() {
        int number = 12234544;
        int[] expected = {2, 4};
        int[] result = RepeatedDigitsFinder.findRepeatedDigits(number);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindRepeatedDigits_NoRepeatedDigits() {
        // Test case with a number having no repeated digits
        int number = 123456789;
        int[] expected = {};

        int[] result = RepeatedDigitsFinder.findRepeatedDigits(number);

        // Assert that the result matches the expected array
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindRepeatedDigits_SingleDigit() {
        // Test case with a single-digit number
        int number = 5;
        int[] expected = {};

        int[] result = RepeatedDigitsFinder.findRepeatedDigits(number);

        // Assert that the result matches the expected array
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRepeatedDigits_NegativeNumber() {
        // Test case with a negative number (should throw IllegalArgumentException)
        int number = -123;
        RepeatedDigitsFinder.findRepeatedDigits(number); // This line should throw an exception
    }
}
