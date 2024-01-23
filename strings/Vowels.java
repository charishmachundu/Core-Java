package strings;

public class Vowels {

		    public static void main(String[] args) {
	        String inputString = " Welcome to Java Class";
	        int vowelCount = countVowels(inputString);

	        System.out.println("Number of vowels: " + vowelCount);
	    }

	    private static int countVowels(String str) {
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = Character.toLowerCase(str.charAt(i));

	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	        return count;
	    }

}
