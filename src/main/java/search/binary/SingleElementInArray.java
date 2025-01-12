package search.binary;

/**
 * Important Observation
 * First occurrence is present at even index before unique element
 * First occurrence is present at odd index after unique element
 */

/**
 * Great improvement by using safeGet function which helps to
 * put so many conditional checks for avoiding index out of bound
 */

// TC - O(log n) and SC - O(1)
public class SingleElementInArray {

    private static int safeGet(int[] arr, int index) {
        int n = arr.length;
        if (index >= 0 && index < n) {
            return arr[index];
        }
        return Integer.MAX_VALUE;
    }

    private static int singleElementInArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] != safeGet(arr, mid - 1) && arr[mid] != safeGet(arr, mid + 1)) {
                return arr[mid];
            } else {
                int fo = mid;
                if (arr[mid] == safeGet(arr, mid - 1)) {
                    fo = mid - 1;
                }
                if (fo % 2 == 0) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {8, 8, 5, 5, 9, 9, 6, 2, 2, 4, 4};
        System.out.println(singleElementInArray(arr));

        int[] arr1 = {1, 1, 2, 2, 3};
        System.out.println(singleElementInArray(arr1));
    }
}
