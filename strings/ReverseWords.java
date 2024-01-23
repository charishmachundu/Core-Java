package strings;

public class ReverseWords {

	    public static void main(String[] args) {
	        String inputSentence = "Java J2EE Reverse Me";
	        String reversedSentence = reverseWords(inputSentence);

	        System.out.println("Input sentence: " + inputSentence);
	        System.out.println("Reversed sentence: " + reversedSentence);
	    }

	    private static String reverseWords(String sentence) {
	        String[] words = sentence.split("\\s");
	        StringBuilder reversedSentence = new StringBuilder();

	        for (String word : words) {
	            String reversedWord = reverseString(word);
	            reversedSentence.append(reversedWord).append(" ");
	        }

	        return reversedSentence.toString().trim();
	    }

	    private static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;

	        while (left < right) {
	            // Swap characters at left and right indices
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;

	            // Move indices towards the center
	            left++;
	            right--;
	        }

	        return new String(charArray);
	    }
}
