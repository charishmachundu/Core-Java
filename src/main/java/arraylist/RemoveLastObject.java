package arraylist;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void removeLastElement(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println("Last element removed successfully.");
        } else {
            System.out.println("ArrayList is already empty. No element to remove.");
        }
    }

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        // Displaying the original ArrayList
        System.out.println("Original ArrayList: " + stringList);

        // Remove the last element
        removeLastElement(stringList);

        // Displaying the updated ArrayList
        System.out.println("Updated ArrayList: " + stringList);
    }
}
