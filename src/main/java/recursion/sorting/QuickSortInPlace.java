package recursion.sorting;

import java.util.Arrays;

public class QuickSortInPlace {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1, 15, 10};
        int length = nums.length;
        quickSort(nums, 0, length - 1);
        System.out.println(Arrays.toString(nums));
    }

    // Note:
    // 1. Pivot: choose any element (p) -> after first pass - all the elements less than p should
    // be on LHS of p and all the elements greater than p should  be on RHS of p
    private static void quickSort(int[] nums, int low, int hi) {

        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        quickSort(nums, low, e);
        quickSort(nums, s, hi);
    }
}
