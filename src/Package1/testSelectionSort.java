package Package1;
import static org.junit.Assert.*;
import org.junit.Test;


public class testSelectionSort {

    @Test
    public void testPositive() {
        int[] arr = {9, 8, 7, 10, 2};
        int[] sortedArr = {2, 7, 8, 9, 10};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, arr);
    }
    
    @Test
    public void testNegative() {
        int[] arr = {-1, -3, -4, -2, -5};
        int[] sortedArr = {-5, -4, -3, -2, -1};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, arr);
    }
    
    @Test
    public void testMixed() {
        int[] arr = {3, -1, 0, 5, -2};
        int[] sortedArr = {-2, -1, 0, 3, 5};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, arr);
    }
    
    @Test
    public void testDuplicates() {
        int[] arr = {2, 2, 3, 5, 3};
        int[] sortedArr = {2, 2, 3, 3, 5};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, arr);
    }

}

