package sliding_window.fixed;

import java.util.*;

// https://leetcode.com/problems/sliding-window-maximum/description/
// https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
public class MaximumElementOfEachSubarrayOfSizeK {


    public static void main(String[] args) {
        int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k = 4;

        System.out.println(maximumElementOfEachSubarrayOfSizeK(arr, k));

        int[] arr1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        System.out.println(maximumElementOfEachSubarrayOfSizeK(arr1, k1));

    }

    private static List<Integer> maximumElementOfEachSubarrayOfSizeK(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int i = 0;
        int j = 0;

        // we need to move till the end of the array
        while (j < arr.length) {

            // calculation section
            // here basically we are checking while my deque is not empty
            // and the last element added to the queue is less than my current
            // element, then we can safely remove the last element
            // as this will not contribute to the largest element in current window
            // and upcoming windows as well
            while (!deque.isEmpty() && deque.getLast() < arr[j]) {
                deque.removeLast();
            }
            // add the element to the last of the queue
            // basically ensuring the largest element so far is at the front of the queue
            deque.addLast(arr[j]);

            // check when the window length is not reached
            if (j - i + 1 < k) {
                j++; // expand the window
            } else if (j - i + 1 == k) { // when the window length is met

                // find the ans
                ans.add(deque.getFirst());

                if (arr[i] == deque.getFirst()) {
                    deque.removeFirst();
                }

                // slide the window
                i++;
                j++;
            }
        }

        return ans;
    }
}
