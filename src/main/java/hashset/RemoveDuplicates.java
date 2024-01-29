package hashset;
public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seen[currentChar]) {
                result.append(currentChar);
                seen[currentChar] = true;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "programming";
        String result = removeDuplicates(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + result);
    }
}

