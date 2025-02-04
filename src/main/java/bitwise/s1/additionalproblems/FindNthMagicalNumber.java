package bitwise.s1.additionalproblems;

/**
 * Q3. Find nth Magic Number
 * <p>
 * Problem Description
 * Given an integer A, find and return the Ath magic number.
 * A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
 * First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 * <p>
 * Problem Constraints
 * 1 <= A <= 5000
 * <p>
 * Input Format
 * The only argument given is integer A.
 * <p>
 * Output Format
 * Return the Ath magic number.
 * <p>
 * Example Input
 * Example Input 1:
 * A = 3
 * Example Input 2:
 * A = 10
 * <p>
 * Example Output
 * Example Output 1:
 * 30
 * Example Output 2:
 * 650
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 * 3rd element in this is 30
 * Explanation 2:
 * In the sequence shown in explanation 1, 10th element will be 650.
 */
public class FindNthMagicalNumber {
    public int solve(int A) {
        int ans = 0, x = 1;
        // converting to binary representation
        while (A > 0) {
            x *= 5;
            if (A % 2 == 1)
                ans += x;
            A /= 2;
        }
        return ans;
    }
}
