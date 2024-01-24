package strings;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1");
        String s1 = sc.next();

        System.out.println("Enter String2");
        String s2 = sc.next();

        if (areAnagrams(s1, s2)) {
            System.out.println("Given strings are Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false; // Strings cannot be anagrams if either of them is null
        }

        if (s1.length() != s2.length()) {
            return false; // Different lengths, not anagrams
        }

        int[] counter = new int[26];

        for (char c : s1.toCharArray()) {
            counter[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            counter[c - 'a']--;
        }

        for (int i : counter) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}