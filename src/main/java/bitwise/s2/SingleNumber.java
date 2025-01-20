package bitwise.s2;

/**
 * Q1. Single Number
 * <p>
 * Problem Description
 * Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
 * NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 2000000
 * 0 <= A[i] <= INTMAX
 * <p>
 * Input Format
 * The first and only argument of input contains an integer array A.
 * <p>
 * Output Format
 * Return a single integer denoting the single element.
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 2, 3, 1]
 * Input 2:
 * A = [1, 2, 2]
 * <p>
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * 1
 * <p>
 * Example Explanation
 * Explanation 1:
 * 3 occurs once.
 * Explanation 2:
 * 1 occurs once.
 */
public class SingleNumber {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int num = 0;
        for (int x : A) {
            num ^= x;
        }
        return num;
    }
}
