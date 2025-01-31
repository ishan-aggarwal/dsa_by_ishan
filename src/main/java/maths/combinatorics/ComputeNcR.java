package maths.combinatorics;

/**
 * Q3. Compute nCr % m
 * Problem Description
 * Given three integers A, B, and C, where A represents n, B represents r, and C represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 *
 * Problem Constraints
 * 1 <= A * B <= 106
 * 1 <= B <= A
 * 1 <= C <= 106
 * Input Format
 * The first argument given is integer A ( = n).
 * The second argument given is integer B ( = r).
 * The third argument given is integer C ( = m).
 *
 * Output Format
 * Return the value of nCr % m.
 *
 * Example Input
 * Input 1:
 *  A = 5
 *  B = 2
 *  C = 13
 * Input 2:
 *  A = 6
 *  B = 2
 *  C = 13
 *
 * Example Output
 * Output 1:
 *  10
 * Output 2:
 *  2
 *
 * Example Explanation
 * Explanation 1:
 *  The value of 5C2 % 11 is 10.
 * Explanation 2:
 *  The value of 6C2 % 13 is 2.
 */
public class ComputeNcR {
    public int solve(int A, int B, int C) {

        // A -> n, B -> r
        // nCr -> n-1Cr-1 + n-1Cr

        if (A == B || B == 0) {
            return 1;
        }

        int[][] dp = new int[A + 1][B + 1];

        // when n = 0, we are filling 0
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
                dp[i][j] %= C;
            }
        }
        return dp[A][B];
    }
}
