package sliding_window.fixed;

// https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/
public class MaximumSumOfAllSubarrayOfSizeK {


    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSumOutOfAllSubArrays(arr, k));
    }

    private static int maxSumOutOfAllSubArrays(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        // initialize both start and end index at zero
        int i = 0, j = 0;
        // we need to iterate till the end of the array using the end index
        while (j < arr.length) {
            // perform the calculation first
            currentSum += arr[j];

            // if the windows size is still not reached, expand the window by increasing the right pointer
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) { // if the current window size has reached the given k

                // calculate what is the maximum answer so far
                maxSum = Math.max(maxSum, currentSum);

                // as we would be sliding the window from the left - so reduce the left element value from the current sum
                currentSum -= arr[i];

                // we need to slide the window
                i++;
                j++;
            }

        }

        // finally return the answer
        return maxSum;
    }
}
