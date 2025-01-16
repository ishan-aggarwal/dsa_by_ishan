package arrays.s2;

import java.util.ArrayList;

/**
 * Q3. Sum of all Submatrices
 * <p>
 * Problem Description
 * Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
 * <p>
 * Problem Constraints
 * 1 <= N <=30
 * 0 <= A[i][j] <= 10
 * <p>
 * Input Format
 * Single argument representing a 2-D array A of size N x N.
 * <p>
 * Output Format
 * Return an integer denoting the sum of all possible submatrices in the given matrix.
 * <p>
 * Example Input
 * Input 1:
 * A = [ [1, 1]
 * [1, 1] ]
 * Input 2:
 * A = [ [1, 2]
 * [3, 4] ]
 * <p>
 * Example Output
 * Output 1:
 * 16
 * Output 2:
 * 40
 * <p>
 * Example Explanation
 * Example 1:
 * Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
 * Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
 * Number of submatrices with 3 elements = 0
 * Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
 * Total Sum = 4+8+4 = 16
 * <p>
 * Example 2:
 * The submatrices are [1], [2], [3], [4], [1, 2], [3, 4], [1, 3], [2, 4] and [[1, 2], [3, 4]].
 * Total sum = 40
 */

public class SumOfAllSubmatrices {

    public int solve(ArrayList<ArrayList<Integer>> A) {
        // total rows and cols in matrix
        int n = A.size();
        int m = A.get(0).size();

        // overall sum
        int sum = 0;

        // find all possible points for starting and ending in matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // [0,0] -> [i,j]
                int tl = (i + 1) * (j + 1);
                // [i, j] -> [n - 1, m - 1]
                int br = (n - i) * (m - j);
                int contribution = A.get(i).get(j) * tl * br;
                sum += contribution;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
