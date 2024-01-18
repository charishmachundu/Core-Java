package array;

public class RotateArray {
        public static void main(String[] args){
            int[] arr = {1,2,3,4,5,6,7};
            int x = 2;
            int n = arr.length;
            x = x % n;
            int[] temp = new int[x];

            for (int i = 0; i < x; i++) {
                temp[i] = arr[i];
            }

            for (int i = x; i < n; i++) {
                arr[i - x] = arr[i];
            }
            for (int i = 0; i < x; i++) {
                arr[n - x + i] = temp[i];
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
}
