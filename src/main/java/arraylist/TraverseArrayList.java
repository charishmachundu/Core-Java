package arraylist;
import java.util.ArrayList;

import java.util.ArrayList;

public class TraverseArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");

        // Using regular for loop to traverse the ArrayList
        System.out.println("Traversing ArrayList using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Using enhanced for loop to traverse the ArrayList
        System.out.println("\nTraversing ArrayList using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
