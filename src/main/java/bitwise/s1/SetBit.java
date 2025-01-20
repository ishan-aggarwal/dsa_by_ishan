package bitwise.s1;

/**
 * Q1. Set Bit
 * <p>
 * Problem Description
 * You are given two integers A and B.
 * Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
 * Note:
 * The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
 * <p>
 * Problem Constraints
 * 0 <= A <= 30
 * 0 <= B <= 30
 * <p>
 * Input Format
 * First argument A is an integer.
 * Second argument B is an integer.
 * <p>
 * <p>
 * Output Format
 * Return an integer.
 * <p>
 * Example Input
 * Input 1:
 * A = 3
 * B = 5
 * Input 2:
 * A = 4
 * B = 4
 * <p>
 * Example Output
 * Output 1:
 * 40
 * Output 2:
 * 16
 * <p>
 * Example Explanation
 * For Input 1:
 * The binary expression is 101000 which is 40 in decimal.
 * For Input 2:
 * The binary expression is 10000 which is 16 in decimal
 */
public class SetBit {
    public int solve(int A, int B) {
        int ans = 0;
        ans = ans | (1 << A);
        ans = ans | (1 << B);
        return ans;
    }
}
