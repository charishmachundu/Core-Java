package lambda;
import java.util.List;

public class MaxElementFinder {

    public static String findMaxElement(List<String> strings) {
        return strings.stream()
                .max(String::compareTo)
                .orElse(null);
    }
}
