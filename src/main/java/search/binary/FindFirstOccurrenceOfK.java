package search.binary;

// Given a sorted array find first occurrence of k
// TC - O(log N) and SC - O(1)
public class FindFirstOccurrenceOfK {

    public static int findFirstOccurrenceOfK(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                ans = mid;
                r = mid - 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -5, -3, 0, 0, 1, 5, 5, 5, 5, 5, 8, 10, 10, 15};
        int k = 5;
        System.out.println(findFirstOccurrenceOfK(arr, k));
    }
}
