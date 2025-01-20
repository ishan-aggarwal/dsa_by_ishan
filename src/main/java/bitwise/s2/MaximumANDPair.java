package bitwise.s2;

/**
 * Q5. Maximum AND Pair
 * <p>
 * Problem Description
 * Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].
 * <p>
 * Problem Constraints
 * 1 <= len(A) <= 105
 * 1 <= A[i] <= 109
 * <p>
 * Input Format
 * The first argument is an integer array A.
 * <p>
 * Output Format
 * Return a single integer that is the maximum A[i] & A[j].
 * <p>
 * Example Input
 * Input 1:-
 * A = [53, 39, 88]
 * Input 2:-
 * A = [38, 44, 84, 12]
 * <p>
 * Example Output
 * Output 1:-
 * 37
 * Output 2:-
 * 36
 * <p>
 * Example Explanation
 * Explanation 1:-
 * 53 & 39 = 37
 * 39 & 88 = 0
 * 53 & 88 = 16
 * Maximum among all these pairs is 37
 * Explanation 2:-
 * Maximum bitwise and among all pairs is (38, 44) = 36
 */
public class MaximumANDPair {
    public int solve(int[] A) {
        int ans = 0;
        for (int bit = 31; bit >= 0; bit--) {
            int countSetBits = 0;
            for (int x : A) {
                if ((x & (1 << bit)) != 0) {
                    countSetBits++;
                }
            }
            if (countSetBits >= 2) {
                ans |= (1 << bit);
                // make all other numbers 0 where the bit is not set
                for (int i = 0; i < A.length; i++) {
                    // if bit was not set then mark it to 0
                    if ((A[i] & (1 << bit)) == 0) {
                        A[i] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
