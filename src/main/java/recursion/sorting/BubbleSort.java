package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 56};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Bubble sort is about comparing the consecutive elements together i.e. (j and j+1)
     * and then swapping the elements if the element on the left (j) is larger than element on the right (j+1)
     * So after first pass, the largest element in the array will eventually reach to the very last position
     * <p>
     * So from next time, we will have one less comparison.
     *
     * @param arr
     * @param r
     * @param c
     */
    public static void bubbleSort(int[] arr, int r, int c) {
        // if there are no elements in the array
        // we can simply return
        if (r == 0) {
            return;
        }
        // if we have elements to compare in the current row
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(arr, r, c + 1);
        } else {
            bubbleSort(arr, r - 1, 0);
        }
    }
}
