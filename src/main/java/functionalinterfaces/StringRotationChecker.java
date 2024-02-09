package functionalinterfaces;

public class StringRotationChecker {

    // Method to check if one string is a rotation of another
    public static boolean isRotation(String str1, String str2) {
        // Check if both strings are not null and have the same length
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself and check if str2 is a substring
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
