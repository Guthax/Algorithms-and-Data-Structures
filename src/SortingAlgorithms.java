public class SortingAlgorithms {

    public static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * Algorithms that applies bubble sort to a given array of integers.
     * Bubble sort is worst case O(N^2) time complexity
     * @param arr The array to be sorted
     */
    public static void bubbleSort(int[] arr)
    {
        if(arr != null && arr.length > 1) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] < arr[j]) {
                        swap(arr, i, j);
                    }
                }
            }
        }
    }

    



}
