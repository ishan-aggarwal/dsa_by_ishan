package backtracking.s1.additionalproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Q2. Kth Symbol
 * Problem Description
 * <p>
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 * <p>
 * Problem Constraints
 * 1 <= A <= 20
 * 0 <= B < 2A - 1
 * <p>
 * Input Format
 * First argument is an integer A.
 * Second argument is an integer B.
 * <p>
 * Output Format
 * Return an integer denoting the Bth indexed symbol in row A.
 * <p>
 * Example Input
 * Input 1:
 * A = 3
 * B = 0
 * Input 2:
 * A = 4
 * B = 4
 * <p>
 * Example Output
 * Output 1:
 * 0
 * Output 2:
 * 1
 * <p>
 * Example Explanation
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

/**
 * We will try to generate each of the rows through recursion.
 * The first row will have a single integer 0.
 * The subsequent rows can be found by replacing 0 with 0 and 1 and
 * replacing 1 with 1 and 0.
 * <p>
 * Time Complexity : O(2^A)
 * Space Complexity : O(2^A)
 */

public class KthSymbol {
    public static int solve(int A, int B) {
        List<Integer> result = helper(A);
        return result.get(B);
    }

    private static List<Integer> helper(int A) {

        // base condition when A is 1, then just put a 0 in the row and return
        if (A == 1) {
            List<Integer> current = new ArrayList<>();
            current.add(0);
            return current;
        }

        // actual logic
        // find the output for previous row
        List<Integer> previous = helper(A - 1);

        // prepare output for current row based on previous row
        List<Integer> current = new ArrayList<>();
        for (int ele : previous) {
            if (ele == 0) {
                current.add(0);
                current.add(1);
            } else {
                current.add(1);
                current.add(0);
            }
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(solve(2, 1));
    }
}
