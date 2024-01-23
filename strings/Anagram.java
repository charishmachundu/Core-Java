package strings;
import java.util.Arrays;

public class Anagram {
	

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }

	    private static boolean areAnagrams(String s1, String s2) {
	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();

	        // Check if the lengths are equal
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Convert strings to char arrays and sort them
	        char[] charArray1 = s1.toCharArray();
	        char[] charArray2 = s2.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare sorted char arrays
	        return Arrays.equals(charArray1, charArray2);
	    }
}
