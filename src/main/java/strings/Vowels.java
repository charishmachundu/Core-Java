package strings;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = countVowels(input);

        System.out.println("Number of vowels: " + vowelCount);
    }

    static int countVowels(String input) {
        if (input == null) {
            return 0;
        }

        int vowelCount = 0;
        for (char ch : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
