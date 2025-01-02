package backtracking.s2.additionalproblems;

/**
 * Q1. Kth Symbol - Hard
 * Problem Description
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A <= 105
 * <p>
 * 0 <= B <= min(2^(A - 1) - 1 , 10^18)
 * <p>
 * Input Format
 * <p>
 * First argument is an integer A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return an integer denoting the Bth indexed symbol in row A.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = 3
 * B = 0
 * Input 2:
 * <p>
 * A = 4
 * B = 4
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 0
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * Row 1: 0
 * Row 2: 01
 * Row 3: 0110
 * Explanation 2:
 * <p>
 * Row 1: 0
 * Row 2: 01
 * Row 3: 0110
 * Row 4: 01101001
 */

public class KthSymbolHard {
    public int find(int n, long k) {
        if (k == 0) {
            return 0;
        }
        int val = find(n - 1, k / 2);
        if (k % 2 == 0) {
            return val;
        }
        return 1 - val;
    }

    public int solve(int A, long B) {
        return find(A, B);
    }

    public static void main(String[] args) {
        KthSymbolHard obj = new KthSymbolHard();
        System.out.println(obj.solve(3, 0));
        System.out.println(obj.solve(4, 4));
    }
}
