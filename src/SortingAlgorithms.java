import java.util.PriorityQueue;

public class SortingAlgorithms {

    public static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * Function that applies bubble sort to a given array of integers.
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

    /**
     * Function that applies the insertion sort algorithm to an inputted array.
     * Insertion sort is worst case O(N^2) time complexity.
     * @param arr The arrayto be sorted.
     */
    public static void insertionSort(int[] arr)
    {
        if(arr != null && arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                for(int j = i; j > 0; j--)
                {
                    if (arr[j-1] > arr[j])
                    {
                        swap(arr, j, j -1);
                    }
                }
            }
        }
    }

    /**
     * Function that applies selection sort to a given array
     * Selection sort has a worst case time complexity of O(N^2)
     * @param arr The array to be sorted
     */
    public static void selectionSort(int[] arr)
    {
        if(arr != null && arr.length > 1)
        {
            for(int i = 0; i < arr.length - 1; i++)
            {
                int minIndex = i;
                for(int j = i + 1; j < arr.length; j++)
                {
                    if(arr[j] < arr[minIndex])
                    {
                        minIndex = j;
                    }
                }
                swap(arr, i ,minIndex);
            }
        }
    }

    /**
     * Function that sorts an array of integers using a priority queue.
     * Algorithms has a worst case of O(n^2) time complexity.
     * Because remove on PQueue is O(n)
     * @param arr The array to be sorted.
     */
    public static void pQueueSort(int[] arr)
    {
        if(arr != null && arr.length > 1) {
            PriorityQueue<Integer> pQueue = new PriorityQueue<>();
            for (int i : arr) {
                pQueue.add(i);
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = pQueue.remove();
            }
        }
    }





}
