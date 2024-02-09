package exceptions;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringToIntegerConverterTest {

    @Test
    public void testConvertStringToInteger() {
        assertEquals(23, StringToIntegerConverter.convertStringToInteger("23"));
        assertEquals(-45, StringToIntegerConverter.convertStringToInteger("-45"));
        assertEquals(0, StringToIntegerConverter.convertStringToInteger("0"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInput() {
        StringToIntegerConverter.convertStringToInteger("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
        StringToIntegerConverter.convertStringToInteger(null);
    }
}

