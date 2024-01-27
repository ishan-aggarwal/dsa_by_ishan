package recursion.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 3, 12, 2, 1, 56, 9};
        selectionSort(arr, arr.length - 1, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    // selection sort is all about finding the max element (or index of max element) so far
    // and then finally swapping it with the last element of the array
    // So, after first pass we will get the max element at the last of the array
    // <p>
    // So from next time, we will have one less comparison.
    private static void selectionSort(int[] arr, int r, int c, int max, int pos) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > max) {
                max = arr[c];
                pos = c;
            }
            selectionSort(arr, r, c + 1, max, pos);
        } else {
            // swap last with element at pos
            int temp = arr[r];
            arr[r] = arr[pos];
            arr[pos] = temp;
            selectionSort(arr, r - 1, 0, 0, 0);
        }
    }
}
