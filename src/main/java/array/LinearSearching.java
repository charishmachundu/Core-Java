package array;

public class LinearSearching {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 1, 9, 5 };
		int target = 9;

		// Call the linearSearch Method
		int index = linearSearch(arr, target);

		if (index != -1) {
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + " not found in the array");
		}
	}

	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
