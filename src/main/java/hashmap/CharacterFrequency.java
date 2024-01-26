package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character, Integer> printCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Remove leading and trailing spaces
        input = input.trim();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {  // Ignore space characters
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
