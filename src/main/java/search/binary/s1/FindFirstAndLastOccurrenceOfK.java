package search.binary.s1;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */
public class FindFirstAndLastOccurrenceOfK {
    public static int[] searchRange(int[] nums, int target) {
        int leftMostIndex = findLeftMostIndex(nums, target);
        if (leftMostIndex == -1) {
            return new int[]{-1, -1};
        }
        int rightMostIndex = findRightMostIndex(nums, target);
        return new int[]{leftMostIndex, rightMostIndex};
    }

    private static int findLeftMostIndex(int[] A, int B) {
        int n = A.length;
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] == B) {
                ans = mid;
                r = mid - 1;
            } else if (A[mid] < B) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }


    private static int findRightMostIndex(int[] A, int B) {
        int n = A.length;
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] == B) {
                ans = mid;
                l = mid + 1;
            } else if (A[mid] < B) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
        target = 6;
        System.out.println(Arrays.toString(searchRange(nums, target)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, target)));
    }
}
