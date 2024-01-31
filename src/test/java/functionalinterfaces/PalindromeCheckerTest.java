package functionalinterfaces;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome(121));
        assertTrue(PalindromeChecker.isPalindrome(12321));
        assertFalse(PalindromeChecker.isPalindrome(12345));
        assertFalse(PalindromeChecker.isPalindrome(123));
    }
}
