package arrays.s2.additionalproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1. Minimum Swaps
 * <p>
 * Problem Description
 * Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
 * Note: It is possible to swap any two elements, not necessarily consecutive.
 * <p>
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * -109 <= A[i], B <= 109
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * <p>
 * Output Format
 * Return the minimum number of swaps.
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 12, 10, 3, 14, 10, 5]
 * B = 8
 * <p>
 * Input 2:
 * A = [5, 17, 100, 11]
 * B = 20
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 2
 * <p>
 * Output 2:
 * 1
 * <p>
 * Example Explanation
 * Explanation 1:
 * A = [1, 12, 10, 3, 14, 10, 5]
 * After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 * After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 * Now, all elements less than or equal to 8 are together.
 * <p>
 * Explanation 2:
 * A = [5, 17, 100, 11]
 * After swapping 100 and 11, A => [5, 17, 11, 100].
 * Now, all elements less than or equal to 20 are together.
 */

public class MinimumSwaps {

    public int solve(ArrayList<Integer> A, int B) {

        int n = A.size();
        int windowSize = 0;
        int minSwaps = Integer.MAX_VALUE;

        // count total number of elements less than or equal to B
        // to find the windowsize
        for (int ele : A) {
            if (ele <= B) {
                windowSize++;
            }
        }

        // if only one element is less than or equal to B than simply
        // return 0;
        if (windowSize <= 1) {
            return 0;
        }

        int i = 0, j = 0;
        int currentSwapCount = 0;
        while (j < n) {
            // element will contribute in swap if it is bigger
            // than B than it has to be swapped
            if (A.get(j) > B) {
                currentSwapCount++;
            }

            // if we have reached the window size
            // perform the calculation
            // then shift the window
            // but before shifting see if the element getting removed is
            // from the swapped elements
            if (j - i + 1 == windowSize) {
                minSwaps = Math.min(minSwaps, currentSwapCount);
                if (A.get(i) > B) {
                    currentSwapCount--;
                }
                i++;
            }
            j++;
        }
        return minSwaps;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 12, 10, 3, 14, 10, 5));
        int B = 8;

        MinimumSwaps solution = new MinimumSwaps();
        System.out.println(solution.solve(list, B));
    }
}
