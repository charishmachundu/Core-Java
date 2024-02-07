package functionalinterfaces;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapSorterTest {
    @Test
    public void testSortHashMapByKey() {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 5);
        unsortedMap.put("orange", 3);
        unsortedMap.put("banana", 8);
        unsortedMap.put("grape", 1);

        LinkedHashMap<String, Integer> sortedMap = HashMapSorter.sortHashMapByKey(unsortedMap);

        // Check the order of keys in the sorted map
        assertArrayEquals(new String[]{"apple", "banana", "grape", "orange"}, sortedMap.keySet().toArray());

        // Check the corresponding values in the sorted map
        assertArrayEquals(new Integer[]{5, 8, 1, 3}, sortedMap.values().toArray());
    }
}

