package lambda;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquares {

    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(n -> n * n)
                .sum();
    }
}
