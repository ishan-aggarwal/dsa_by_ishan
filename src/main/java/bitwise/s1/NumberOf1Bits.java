package bitwise.s1;

/**
 * Q4. Number of 1 Bits
 * <p>
 * Problem Description
 * Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
 * <p>
 * Problem Constraints
 * 1 <= A <= 109
 * <p>
 * Input Format
 * First and only argument contains integer A
 * <p>
 * Output Format
 * Return an integer
 * <p>
 * Example Input
 * Input 1:
 * 11
 * Input 2:
 * 6
 * <p>
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * 2
 * <p>
 * Example Explanation
 * Explaination 1:
 * 11 is represented as 1011 in binary.
 * Explaination 2:
 * 6 is represented as 110 in binary.
 */
public class NumberOf1Bits {
    public int numSetBits(int A) {
        int count = 0;
        for (int bit = 31; bit >= 0; bit--) {
            if ((A & (1 << bit)) != 0) {
                count++;
            }
        }
        return count;
    }
}
