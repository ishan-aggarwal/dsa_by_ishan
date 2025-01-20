package bitwise.s2;

/**
 * Q4. Find Two Missing Numbers
 * <p>
 * Problem Description
 * Given an array A of length N where all the elements are distinct and are in the range [1, N+2].
 * Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= N+2
 * <p>
 * The elements of array A are distinct
 * <p>
 * Input Format
 * Only argument A is an array of integers
 * <p>
 * Output Format
 * Return a sorted array of size 2 denoting the missing elements.
 * <p>
 * Example Input
 * Input 1:
 * A = [3, 2, 4]
 * Input 2:
 * A = [5, 1, 3, 6]
 * <p>
 * Example Output
 * Output 1:
 * [1, 5]
 * Output 2:
 * [2, 4]
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The missing numbers are 1 and 5.
 * For Input 2:
 * The missing numbers are 2 and 4.
 */
public class FindTwoMissingNumbers {
    public int[] solve(int[] A) {
        int xorAll = 0;
        int n = A.length;

        for (int x : A) {
            xorAll ^= x;
        }

        for (int i = 1; i <= n + 2; i++) {
            xorAll ^= i;
        }

        int pos = -1;
        for (int bit = 0; bit < 32; bit++) {
            if ((xorAll & (1 << bit)) != 0) {
                pos = bit;
            }
        }

        int num1 = 0;
        int num2 = 0;
        for (int x : A) {
            if ((x & (1 << pos)) != 0) {
                num1 ^= x;
            } else {
                num2 ^= x;
            }
        }

        for (int i = 1; i <= n + 2; i++) {
            if ((i & (1 << pos)) != 0) {
                num1 ^= i;
            } else {
                num2 ^= i;
            }
        }

        if (num1 < num2) {
            return new int[]{num1, num2};
        } else {
            return new int[]{num2, num1};
        }
    }
}
