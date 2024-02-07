package functionalinterfaces;

public class ArraySumCalculator {
    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
