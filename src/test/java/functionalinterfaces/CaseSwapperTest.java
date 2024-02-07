package functionalinterfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaseSwapperTest {

	@Test
    public void testConvertCase() {
        assertEquals("HELLO world", CaseSwapper.convertCase("hello WORLD"));
        assertEquals("java PROGRAMMING", CaseSwapper.convertCase("JAVA programming"));
        assertEquals("123!@#", CaseSwapper.convertCase("123!@#"));

	}
}