package functionalinterfaces;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    public static int countUniqueWords(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Unique words: " + wordCountMap.keySet());
        return wordCountMap.size();
    }
}
