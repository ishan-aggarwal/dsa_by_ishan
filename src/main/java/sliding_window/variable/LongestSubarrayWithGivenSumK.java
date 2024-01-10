package sliding_window.variable;


// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
// https://www.geeksforgeeks.org/longest-sub-array-sum-k/

import java.util.Arrays;

public class LongestSubarrayWithGivenSumK {

    // Function for finding maximum and value pair
    public static int[] lenOfLongSubarrayWithGivenSumK(int arr[], int n, int k) {

        int i = 0, j = 0;
        // default minimum length is initialized to zero
        int maxWindowLength = 0;
        int startI = 0, startJ = 0;
        // current sum of elements in window is zero
        int currentSum = 0;

        // iterate over the complete array
        while (j < n) {

            // perform initial calculation
            // by adding right most element to currentSum
            currentSum += arr[j];

            // if current sum is equal to the sum we want to find - we got a probable sum
            if (currentSum == k) {

                // check if the current window length is greater than maxWindowFoundSoFar
                int currentWindowLength = j - i + 1;
                if (maxWindowLength < currentWindowLength) {
                    maxWindowLength = currentWindowLength;
                    startI = i;
                    startJ = j;
                }
            } else if (currentSum > k) { // in case the currentSum for currentwindow has exceeded the target sum
                // we need to start shrinking the window
                // shrink the window from left
                while (i < j && currentSum > k) {
                    currentSum -= arr[i];
                    i++;
                }
                // after reducing the sum if it matches the targetSum (k)
                if (currentSum == k) {
                    int currentWindowLength = j - i + 1;
                    if (maxWindowLength < currentWindowLength) {
                        maxWindowLength = currentWindowLength;
                        startI = i;
                        startJ = j;
                    }
                }
            }
            // finally increase the window from right by 1
            j++;
        }

        return new int[]{startI, startJ};
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(Arrays.toString(lenOfLongSubarrayWithGivenSumK(arr, arr.length, k)));

        int[] arr1 = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        k = 15;
        System.out.println(Arrays.toString(lenOfLongSubarrayWithGivenSumK(arr1, arr1.length, k)));
    }
}
