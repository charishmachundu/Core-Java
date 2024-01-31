package functionalinterfaces;

import org.junit.Test;

public class RepeatedCharactersIdentifierTest {
    @Test
    public void testPrintRepeatedCharacters() {
        RepeatedCharactersIdentifier.printRepeatedCharacters("programming");
        System.out.println();
        RepeatedCharactersIdentifier.printRepeatedCharacters("hello");
    }
}

