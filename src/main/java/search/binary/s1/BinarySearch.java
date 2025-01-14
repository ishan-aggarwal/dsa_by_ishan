package search.binary.s1;

import java.util.Arrays;

// TC - O(log n) and SC - O(1)
public class BinarySearch {



    public static int search(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-9, 1, 2, 6, 8, 10, 24, 67, 81};
        Arrays.sort(arr);
        System.out.println(search(arr, 67));
        System.out.println(search(arr, 0));
    }
}
