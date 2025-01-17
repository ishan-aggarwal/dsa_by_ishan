package arrays.intermediate.c1;

/**
 * Q2. Reverse in a range
 * <p>
 * Problem Description
 * Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 * 0 <= B <= C <= N - 1
 * <p>
 * <p>
 * Input Format
 * The first argument A is an array of integer.
 * The second and third arguments are integers B and C
 * <p>
 * Output Format
 * Return the array A after reversing in the given range.
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4]
 * B = 2
 * C = 3
 * <p>
 * Input 2:
 * A = [2, 5, 6]
 * B = 0
 * C = 2
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [1, 2, 4, 3]
 * Output 2:
 * [6, 5, 2]
 * <p>
 * Example Explanation
 * Explanation 1:
 * We reverse the subarray [3, 4].
 * Explanation 2:
 * We reverse the entire array [2, 5, 6].
 */

public class ReverseInRange {
    public int[] solve(int[] A, int B, int C) {
        reverse(A, B, C);
        return A;
    }

    private static void reverse(int[] A, int s, int e) {
        int l = s;
        int r = e;
        while (l < r) {
            int temp = A[l];
            A[l] = A[r];
            A[r] = temp;
            l++;
            r--;
        }
    }
}
