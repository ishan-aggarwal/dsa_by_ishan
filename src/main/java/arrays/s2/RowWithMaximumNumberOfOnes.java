package arrays.s2;

import java.util.ArrayList;

/**
 * Q4. Row with maximum number of ones
 * <p>
 * Problem Description
 * Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.
 * <p>
 * NOTE:
 * If two rows have the maximum number of 1 then return the row which has a lower index.
 * Rows are numbered from top to bottom and columns are numbered from left to right.
 * Assume 0-based indexing.
 * Assume each row to be sorted by values.
 * Expected time complexity is O(rows + columns).
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 1000
 * 0 <= A[i] <= 1
 * <p>
 * Input Format
 * The only argument given is the integer matrix A.
 * <p>
 * Output Format
 * Return the row with the maximum number of 1.
 * <p>
 * Example Input
 * Input 1:
 * A = [
 * [0, 1, 1]
 * [0, 0, 1]
 * [0, 1, 1]   ]
 * Input 2:
 * A = [   [0, 0, 0, 0]
 * [0, 0, 0, 1]
 * [0, 0, 1, 1]
 * [0, 1, 1, 1]    ]
 * <p>
 * Example Output
 * Output 1:
 * 0
 * <p>
 * Output 2:
 * 3
 * <p>
 * Example Explanation
 * Explanation 1:
 * Row 0 has maximum number of 1s.
 * <p>
 * Explanation 2:
 * Row 3 has maximum number of 1s.
 */

public class RowWithMaximumNumberOfOnes {

    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();
        int ansRow = -1;
        int r = 0, c = m - 1;
        while (r < n && c >= 0) {
            while (c >= 0 && A.get(r).get(c) == 1) {
                ansRow = r;
                c--;
            }
            r++;
        }
        return ansRow;
    }
}
