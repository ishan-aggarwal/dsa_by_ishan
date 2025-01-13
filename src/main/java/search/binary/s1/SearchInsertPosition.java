package search.binary.s1;

// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        System.out.println(searchInsert(A, 5));
        System.out.println(searchInsert(A, 2));
        System.out.println(searchInsert(A, 7));
    }
}
