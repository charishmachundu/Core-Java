package lambda;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringVowelCounterTest {
    @Test
    public void testPrintStringsWithVowels() {
        String[] input1 = {"hello", "world", "apple", "banana", "java", "stream"};
        String expectedOutput1 = "String: hello, Vowel Count: 2\nString: world, Vowel Count: 1\nString: apple, Vowel Count: 2\nString: banana, Vowel Count: 3\nString: java, Vowel Count: 2\nString: stream, Vowel Count: 2\n";

        // Redirect System.out.println to capture output for testing
        StringBuilder output1 = new StringBuilder();
        System.setOut(new java.io.PrintStream(System.out) {
            public void println(String x) {
                output1.append(x).append("\n");
            }
        });

        StringVowelCounter.printStringsWithVowels(input1);

        assertEquals(expectedOutput1, output1.toString());

        // Test case 2: No strings with vowels
        String[] input2 = {"fly", "sky", "dry", "myth"};
        String expectedOutput2 = "";

        StringBuilder output2 = new StringBuilder();
        System.setOut(new java.io.PrintStream(System.out) {
            public void println(String x) {
                output2.append(x).append("\n");
            }
        });

        StringVowelCounter.printStringsWithVowels(input2);

        assertEquals(expectedOutput2, output2.toString());
    }
}


