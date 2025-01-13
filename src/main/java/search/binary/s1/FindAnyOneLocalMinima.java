package search.binary.s1;

// An element which is lesser than or equal to its adjacent elements
// 3 6 1 0 9 15 8
public class FindAnyOneLocalMinima {
    public static int findAnyOneLocalMinima(int[] arr) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] <= safeGet(arr, mid - 1) && arr[mid] <= safeGet(arr, mid + 1)) {
                return arr[mid];
            } else if (arr[mid] > safeGet(arr, mid - 1) && arr[mid] < safeGet(arr, mid + 1)) {
                r = mid - 1;
            } else /*if (arr[mid] < safeGet(arr, mid - 1) && arr[mid] > safeGet(arr, mid + 1))*/ {
                l = mid + 1;
            }
        }
        return -1;
    }

    private static int safeGet(int[] arr, int idx) {
        if (idx >= 0 && idx < arr.length) {
            return arr[idx];
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] A = {3, 6, 1, 12, 9, 15, 8};
        System.out.println(findAnyOneLocalMinima(A));
    }
}
