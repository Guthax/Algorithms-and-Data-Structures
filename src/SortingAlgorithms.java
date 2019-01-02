import java.util.Arrays;
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

    public  static void mergeSort(int[] arr) {
        if(arr != null && arr.length > 1) {
            mergeSort(arr, 0, arr.length - 1);
        }
    }

    public  static void mergeSort(int Arr[], int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid+1, end);
            merge(Arr, start, mid, end);
        }
    }


    public static void merge(int Arr[], int start, int mid, int end) {

        // create a temp array
        int temp[] = new int[end - start + 1];

        // crawlers for both intervals and for temp
        int left = start;
        int right = mid+1;
        int index = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while(left <= mid && right <= end) {
            if(Arr[left] <= Arr[right]) {
                temp[index] = Arr[left++];
            }
            else {
                temp[index] = Arr[right++];
            }
            index++;
        }

        // add elements left in the first interval
        while(left <= mid) {
            temp[index++] = Arr[left++];
        }

        // add elements left in the second interval
        while(right <= end) {
            temp[index++] = Arr[right++];
        }

        // copy temp to original interval
        for(left = start; left <= end; left++) {
            Arr[left] = temp[left - start];
        }
    }




    /**
     * Function that applies quicksort algorithm to a given array.
     * The worst case time complexity of quick sort is O(N^2)
     * @param arr The array to apply quicksort on
     */
    public static void quickSort(int[] arr)
    {
        if(arr != null && arr.length > 1) {
            quickSort(arr, 0, arr.length - 1);
        }
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int split = partition(arr, low, high);
            quickSort(arr, low, split - 1);
            quickSort(arr, split + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high)
    {
        int pivotValue = arr[high]; //Pivot set to last element

        int left = low;
        int right = high - 1;

        boolean finished = false;
        while (!finished)
        {
            while (left <= right && arr[left] <= pivotValue)
            {
                left++;
            }
            while (right >= left && arr[right] >= pivotValue)
            {
                right--;
            }

            if(right < left)
            {
                finished = true;
            }
            else
            {
                swap(arr, left, right);
            }
        }

        swap(arr, high, left);
        return right;
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
