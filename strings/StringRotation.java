package strings;

public class StringRotation {
	    public static void main(String[] args) {
	        String str1 = "JavaJ2eeStrutsHibernate";
	        String str2 = "StrutsHibernateJavaJ2ee";

	        if (areRotations(str1, str2)) {
	            System.out.println(str1 + " is a rotation of " + str2);
	        } else {
	            System.out.println(str1 + " is not a rotation of " + str2);
	        }
	    }

	    private static boolean areRotations(String s1, String s2) {
	        // Check if lengths are equal and not zero
	        if (s1.length() != s2.length() || s1.length() == 0) {
	            return false;
	        }

	        // Concatenate s1 with itself
	        String concatenated = s1 + s1;

	        // Check if s2 is a substring of the concatenated string
	        return concatenated.contains(s2);
	    }
}
