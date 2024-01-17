package Conditions;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10, a = 0, b = 1;
        System.out.println("Fibonacci Series till " + n + " numbers:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + ", ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
