package array;

public class MoveZeros {
        public static void main(String[] args) {
            int[] numbers = {0, 2, 0, 3, 4, 0, 1, 5, 0};
            moveZeros(numbers);
            System.out.print("Modified Array: ");
            for (int num : numbers) {
                System.out.print(num+" ");
            }
        }

        public static void moveZeros(int[] nums) {
            int nonZeroIndex = 0;
            for (int num : nums) {
                if (num != 0) {
                    nums[nonZeroIndex] = num;
                    nonZeroIndex++;
                }
            }
            for (int i = nonZeroIndex; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
}
