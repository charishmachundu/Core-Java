package functionalinterfaces;

import java.util.*;

public class HashMapSorter {
    public static LinkedHashMap<String, Integer> sortHashMapByKey(HashMap<String, Integer> hashMap) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Sort the entryList based on keys
        entryList.sort(Map.Entry.comparingByKey());

        // Create a LinkedHashMap to store the sorted entries
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        // Populate the sortedMap with sorted entries
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
