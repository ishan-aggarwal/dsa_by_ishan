package arrays.intermediate.c2;

/**
 * Given an integer array with N elements and Q queries
 * For each query l, r
 * calculate sum of all odd indexed elements from index l to index r
 */

// TC - O(N+Q) and SC - O(N)
public class RangeSumOddIndexedQQueries {
    public void rangeSumOddIndexed(int[] A, int[][] queries) {
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = 0;
        for (int i = 1; i < n; i++) {
            int val = 0;
            if (i % 2 == 1) {
                val = A[i];
            }
            ps[i] = val + ps[i - 1];
        }

        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int sum;
            if (l == 0) {
                sum = ps[r];
            } else {
                sum = ps[r] - ps[l - 1];
            }
            System.out.println(sum);
        }
    }
}
