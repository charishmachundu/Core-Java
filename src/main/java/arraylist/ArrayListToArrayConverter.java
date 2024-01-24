package arraylist;

import java.util.ArrayList;

public class ArrayListToArrayConverter {
    public static String[] convertToArray(ArrayList<String> arrayList) {
        // Convert ArrayList to Array
        String[] array = new String[arrayList.size()];
        array = arrayList.toArray(array);
        return array;
    }

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        // Convert ArrayList to Array
        String[] stringArray = convertToArray(stringList);

        // Display the converted Array
        System.out.println("Converted Array:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}

