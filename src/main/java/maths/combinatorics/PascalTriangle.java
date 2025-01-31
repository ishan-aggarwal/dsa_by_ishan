package maths.combinatorics;

/**
 * Q1. Pascal Triangle
 * Problem Description
 * Write a program to print the pascal triangle up to A rows.
 * <p>
 * Problem Constraints
 * 1 <= A <= 25
 * <p>
 * Input Format
 * The first argument is an integer A.
 * <p>
 * Output Format
 * Return a 2D array consisting of A rows whose each row contains A integers.
 * <p>
 * Example Input
 * Input 1:
 * A = 3
 * Input 2:
 * A = 5
 * Example Output
 * Output 1:
 * 1 0 0
 * 1 1 0
 * 1 2 1
 * Output 2:
 * 1 0 0 0 0
 * 1 1 0 0 0
 * 1 2 1 0 0
 * 1 3 3 1 0
 * 1 4 6 4 1
 * <p>
 * Example Explanation
 * Explanation 1:
 * Row 1 = 1 0 0
 * Row 2 = 1C0 1C1 0 = 1 1 0
 * Row 3 = 2C0 2C1 2C2 = 1 2 1
 */
public class PascalTriangle {

    public int[][] solve1(int A) {
        int[][] ans = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
                }
            }
        }
        return ans;
    }


    public int[][] solve(int A) {
        int[][] ans = new int[A][A];
        // entire first row has zero's expect column 1
        for (int j = 0; j < A; j++) {
            ans[0][j] = 0;
        }
        // because first column of every row is 1
        for (int i = 0; i < A; i++) {
            ans[i][0] = 1;
        }

        // in order to fill the other rows now
        for (int i = 1; i < A; i++) {
            for (int j = 1; j < A; j++) {
                // diagonal elements are all 1
                if (i == j) {
                    ans[i][j] = 1;
                } else {
                    // current element is sum of previous row elements
                    // at same col and (col-1)
                    ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
                }
            }
        }

        return ans;
    }
}
