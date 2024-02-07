package lambda;
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathOperationExample {
    public static void main(String[] args) {
        // Implementation using a lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Test cases
        int result1 = addition.operate(5, 3);
        int result2 = addition.operate(-2, 8);

        System.out.println("Result 1: " + result1); // Expected output: 8
        System.out.println("Result 2: " + result2); // Expected output: 6
    }
}
