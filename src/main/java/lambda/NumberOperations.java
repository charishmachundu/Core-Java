package lambda;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOperations {

    public static List<Integer> filterAndDouble(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
