package lambda;
import java.util.Arrays;

public class StringVowelCounter {
    public static void printStringsWithVowels(String[] strings) {
        Arrays.stream(strings)
                .filter(s -> s.toLowerCase().matches(".*[aeiou].*"))
                .forEach(s -> System.out.println("String: " + s + ", Vowel Count: " + countVowels(s)));
    }

    private static long countVowels(String str) {
        return str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    public static void main(String[] args) {
        String[] strings = {"hello", "world", "apple", "banana", "java", "stream"};

        printStringsWithVowels(strings);
    }
}
