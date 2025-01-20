package bitwise.s2;

/**
 * Q3. Single Number III
 * <p>
 * Problem Description
 * Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
 * Find the two integers that appear only once.
 * Note: Return the two numbers in ascending order.
 * <p>
 * Problem Constraints
 * 2 <= |A| <= 100000
 * 1 <= A[i] <= 109
 * <p>
 * Input Format
 * The first argument is an array of integers of size N.
 * <p>
 * Output Format
 * Return an array of two integers that appear only once.
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 1, 2, 4]
 * Input 2:
 * A = [1, 2]
 * <p>
 * Example Output
 * Output 1:
 * [3, 4]
 * Output 2:
 * [1, 2]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * 3 and 4 appear only once.
 * Explanation 2:
 * 1 and 2 appear only once.
 */
public class SingleNumberIII {
    public int[] solve(int[] A) {
        int xorAll = 0;
        for (int x : A) {
            xorAll ^= x;
        }

        int setBitPosition = -1;
        for (int i = 0; i < 32; i++) {
            if ((xorAll & (1 << i)) != 0) {
                setBitPosition = i;
                break;
            }
        }

        int num1 = 0;
        int num2 = 0;
        for (int x : A) {
            if ((x & (1 << setBitPosition)) != 0) {
                num1 ^= x;
            } else {
                num2 ^= x;
            }
        }

        if (num1 < num2) {
            return new int[]{num1, num2};
        } else {
            return new int[]{num2, num1};
        }
    }
}
