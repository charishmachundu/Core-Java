package exceptions;
public class StringToIntegerConverter {

    public static int convertStringToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + input + ". Cannot convert to integer.");
        }
    }

    public static void main(String[] args) {
        // Sample inputs
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = convertStringToInteger(input);
                System.out.println("Conversion of '" + input + "' to integer: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
