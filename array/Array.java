package array;

public class Array {

        public static void main(String[] args) {
            int[] integerArray = {4, 2, 7, 1, 9, 5};
            findLargestAndSmallest(integerArray);
        }

        public static void findLargestAndSmallest(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty.");
                return;
            }

            int largest = arr[0];
            int smallest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                } else if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }

}
