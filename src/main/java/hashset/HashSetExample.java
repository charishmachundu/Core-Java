package hashset;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> stringHashSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");
        stringHashSet.add("Cherry");
        stringHashSet.add("Date");
        stringHashSet.add("Orange");
        stringHashSet.add("Grapes");
        stringHashSet.add("Kiwi");
        stringHashSet.add("Mango");
        stringHashSet.add("Pineapple");
        stringHashSet.add("Watermelon");

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate using for loop
        System.out.println("\nIterating using for loop:");
        Object[] stringArray = stringHashSet.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        // Iterate using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : stringHashSet) {
            System.out.println(fruit);
        }
    }
}
