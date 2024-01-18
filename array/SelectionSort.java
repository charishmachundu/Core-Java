package array;

public class SelectionSort {
        void selectionSort(int arr[])
        {
            int pos;
            int temp;
            for (int i = 0; i < arr.length; i++)
            {
                pos = i;
                for (int j = i+1; j < arr.length; j++)
                {
                    if (arr[j] < arr[pos])
                    {
                        pos = j;
                    }
                }

                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
        // Displaying the array
        void display(int arr[])
        {
            for (int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

        public static void main(String args[])
        {
            array.SelectionSort sorting = new array.SelectionSort();
            int arr[] = {64,25,12,22,11};
            sorting.selectionSort(arr);
            sorting.display(arr);
        }
}
