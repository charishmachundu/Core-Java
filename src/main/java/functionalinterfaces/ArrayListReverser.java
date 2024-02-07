package functionalinterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverser {
    public static <T> void reverseArrayList(ArrayList<T> list) {
        Collections.reverse(list);
    }
}
