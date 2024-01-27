package recursion.sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // Merge Sort: (divide and conquer)
    // 1. Divide array into two parts recursively until size of each part is <= 1
    // 2. Get both parts sorted via recursion
    // 3. Merge the sorted parts together

    private static void mergeSortInPlace(int[] arr, int s, int e) {
        // there is just 1 element in the array with respect to the indices called upon so returning
        if (e - s <= 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {

            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // copy the merged sorted elements back to arr
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

    }
}
