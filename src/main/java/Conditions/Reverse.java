package Conditions;

public class Reverse {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;

        while(number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
