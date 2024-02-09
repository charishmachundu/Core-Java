package functionalinterfaces;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringRotationCheckerTest {

    @Test
    public void testIsRotation_PositiveCase() {
        assertTrue(StringRotationChecker.isRotation("hello", "ohell"));
        assertTrue(StringRotationChecker.isRotation("abc", "cab"));
        assertTrue(StringRotationChecker.isRotation("abcd", "dabc"));
    }

    @Test
    public void testIsRotation_NegativeCase() {
        assertFalse(StringRotationChecker.isRotation("hello", "world"));
        assertFalse(StringRotationChecker.isRotation("abc", "xyz"));
        assertFalse(StringRotationChecker.isRotation("abcd", "dcba"));
    }

    @Test
    public void testIsRotation_NullInput() {
        assertFalse(StringRotationChecker.isRotation(null, "hello"));
        assertFalse(StringRotationChecker.isRotation("hello", null));
        assertFalse(StringRotationChecker.isRotation(null, null));
    }

    @Test
    public void testIsRotation_DifferentLength() {
        assertFalse(StringRotationChecker.isRotation("abc", "abcd"));
        assertFalse(StringRotationChecker.isRotation("abcd", "abc"));
    }
}
