package lambda;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStringsStartingWithA(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
