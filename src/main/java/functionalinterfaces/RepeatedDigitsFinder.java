package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;

public class RepeatedDigitsFinder {

    // Method to find repeated digits in a number
    public static int[] findRepeatedDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a non-negative number");
        }

        String numberStr = Integer.toString(number);
        Map<Character, Integer> digitCountMap = new HashMap<>();

        // Count occurrences of each digit
        for (char digit : numberStr.toCharArray()) {
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
        }

        // Find repeated digits
        return digitCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> Character.getNumericValue(entry.getKey()))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
