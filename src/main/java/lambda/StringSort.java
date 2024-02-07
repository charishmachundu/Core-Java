package lambda;
import java.util.Arrays;

public class StringSort {

    public static void sortStrings(String[] strings) {
        Arrays.sort(strings, (s1, s2) -> {
            int compareLength = Integer.compare(s1.length(), s2.length());
            if (compareLength != 0) {
                return compareLength;
            }
            return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
        });
    }
}