package search.binary.s1;

/**
 * Q3. Find a peak element
 * Problem Description
 * Given an array of integers A, find and return the peak element in it.
 * An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.
 * NOTE:
 * It is guaranteed that the array contains only a single peak element.
 * Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.
 */
public class FindPeakElement {
    public static int findPeakElement(int[] arr) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] >= safeGet(arr, mid - 1) && arr[mid] >= safeGet(arr, mid + 1)) {
                return arr[mid];
            } else if (arr[mid] > safeGet(arr, mid - 1) && arr[mid] < safeGet(arr, mid + 1)) {
                l = mid + 1;
            } else if (arr[mid] < safeGet(arr, mid - 1) && arr[mid] > safeGet(arr, mid + 1)) {
                r = mid - 1;
            }
        }
        return -1;
    }

    private static int safeGet(int[] arr, int idx) {
        if (idx >= 0 && idx < arr.length) {
            return arr[idx];
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(findPeakElement(A));

        int[] A1 = {5, 17, 100, 11};
        System.out.println(findPeakElement(A1));
    }
}
