package arraylist;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class TraverseArrayListTest {

    @Test
    public void testMain() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        TraverseArrayList.main(null);

        // Restore System.out
        System.setOut(System.out);

        // Verify the output
        String expectedOutput = "Traversing ArrayList using a regular for loop:\n" +
                                "Element 1\nElement 2\nElement 3\nElement 4\n\n" +
                                "Traversing ArrayList using an enhanced for loop:\n" +
                                "Element 1\nElement 2\nElement 3\nElement 4\n";

        // Normalize line endings for cross-platform compatibility
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
