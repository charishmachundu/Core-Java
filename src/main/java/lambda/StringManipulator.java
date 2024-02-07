package lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringManipulator {
    public static String[] capitalizeAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted(Comparator.naturalOrder())
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] inputStrings = {"apple", "Banana", "orange", "grape", "Peach"};

        String[] result = capitalizeAndSort(inputStrings);

        System.out.println("Original Strings: " + Arrays.toString(inputStrings));
        System.out.println("Capitalized and Sorted Strings: " + Arrays.toString(result));
    }
}
