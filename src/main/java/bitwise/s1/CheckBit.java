package bitwise.s1;

/**
 * Q3. Check bit
 * <p>
 * Problem Description
 * You are given two integers A and B.
 * Return 1 if B-th bit in A is set
 * Return 0 if B-th bit in A is unset
 * Note:
 * The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 * <p>
 * Problem Constraints
 * 1 <= A <= 109
 * 0 <= B <= 30
 * <p>
 * Input Format
 * First argument A is an integer.
 * Second argument B is an integer.
 * <p>
 * Output Format
 * Return an integer.
 * <p>
 * Example Input
 * Input 1:
 * A = 4
 * B = 1
 * Input 2:
 * A = 5
 * B = 2
 * <p>
 * Example Output
 * Output 1:
 * 0
 * Output 2:
 * 1
 * <p>
 * Example Explanation
 * For Input 1:
 * Given N = 4 which is 100 in binary. The 1-st bit is unset
 * so we return 0
 * For Input 2:
 * Given N = 5 which is 101 in binary. The 2-nd bit is set
 * so we return 1
 */
public class CheckBit {
    public int solve(int A, int B) {
        return (A & (1 << B)) != 0 ? 1 : 0;
    }
}
