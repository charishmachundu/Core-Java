package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static Map<String, Integer> countUniqueWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        if (input == null || input.isEmpty()) {
            return wordCountMap;
        }

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count the occurrence of each word
        for (String word : words) {
            // Remove punctuation and convert to lowercase for case-insensitive counting
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update the word count in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
