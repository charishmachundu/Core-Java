package lambda;
import java.util.Arrays;

public class AverageOfSquares {
    public static double averageOfSquaresOfOddNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double result = averageOfSquaresOfOddNumbers(numbers);
        System.out.println("Average of squares of odd numbers: " + result);
    }
}
