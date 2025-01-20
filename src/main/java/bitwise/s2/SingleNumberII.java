package bitwise.s2;

/**
 * Q2. Single Number II
 * <p>
 * Problem Description
 * Given an array of integers, every element appears thrice except for one, which occurs once.
 * Find that element that does not appear thrice.
 * NOTE: Your algorithm should have a linear runtime complexity.
 * <p>
 * Could you implement it without using extra memory?
 * <p>
 * Problem Constraints
 * 2 <= A <= 5*106
 * 0 <= A <= INTMAX
 * <p>
 * Input Format
 * First and only argument of input contains an integer array A.
 * <p>
 * Output Format
 * Return a single integer.
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
 * Input 2:
 * A = [0, 0, 0, 1]
 * <p>
 * Example Output
 * Output 1:
 * 4
 * Output 2:
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * 4 occurs exactly once in Input 1.
 * 1 occurs exactly once in Input 2.
 */
public class SingleNumberII {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int ans = 0;
        for (int bit = 0; bit < 32; bit++) {
            int countBits = 0;
            for (int x : A) {
                if ((x & (1 << bit)) != 0) {
                    countBits++;
                }
            }
            if (countBits % 3 == 1) {
                ans |= (1 << bit);
            }
        }
        return ans;
    }
}
