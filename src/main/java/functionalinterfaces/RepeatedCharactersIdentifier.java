package functionalinterfaces;

public class RepeatedCharactersIdentifier {
    public static void printRepeatedCharacters(String input) {
        char[] characters = input.toCharArray();

        System.out.print("Repeated characters: ");
        for (int i = 0; i < characters.length; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.print(characters[i] + " ");
                    break;
                }
            }
        }
    }
}
