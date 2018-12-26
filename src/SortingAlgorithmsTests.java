import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortingAlgorithmsTests {

    //Tests for bubble sort
    @Test
    public void testBubbleSort1Sorted()
    {
        int[] testArr = {1,2,3,4};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4}, testArr);
    }
    @Test
    public void testBubbleSort2NotSortedSmall()
    {
        int[] testArr = {5,9,2,1,4};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {1,2,4,5,9}, testArr);
    }
    @Test
    public void testBubbleSort3NotSortedBig()
    {
        int[] testArr = {50,20,1,5,4,3,2,700,3,4,5,5,0};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {0, 1, 2, 3, 3, 4, 4, 5, 5, 5, 20, 50, 700}, testArr);
    }
    @Test
    public void testBubbleSort4Descending()
    {
        int[] testArr = {9,8,7,6,5,4,3,2,1};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, testArr);
    }
    @Test
    public void testBubbleSort5Null()
    {
        int[] testArr = null;
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(null, testArr);
    }





}