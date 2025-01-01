package backtracking.s2;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1. Subset Sum equal to K
 * <p>
 * Problem Description
 * Given an integer array A of size N.
 * You are also given an integer B, you need to find whether their exist a subset in A whose sum equal B.
 * If there exist a subset then return 1 else return 0.
 * Note : Sum of elements of an empty subset is 0.
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= N <= 17
 * <p>
 * -109 <= A[i] <= 109
 * <p>
 * -109 <= B <= 109
 * <p>
 * Input Format
 * <p>
 * First argument is an integer array A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * Output Format
 * <p>
 * Return 1 if there exist a subset with sum B else return 0.
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = [3, 34, -3, 12, 5, 2]
 * B = 9
 * Input 2:
 * <p>
 * A = [-8, 34, 4, 0, -5, -2]
 * B = -20
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * There is a subset (-3, 12) with sum 9.
 * Explanation 2:
 * <p>
 * There is no subset that add up to -20.
 */

public class SubsetSumEqualsK {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(-5, 3));
        int res = subsetSum(A, -2);
        System.out.println(res);
    }

    public static int subsetSum(ArrayList<Integer> A, int B) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        helper(res, current, 0, A, B);

        if (!res.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    private static void helper(List<List<Integer>> res, List<Integer> current, int idx, ArrayList<Integer> A, int B) {
        // base condition
        if (B == 0) {
            res.add(new ArrayList<>(current));
            return;
        }

        if (idx == A.size()) {
            return;
        }

        // actual logic
        int element = A.get(idx);
        // pick
        current.add(element);
        helper(res, current, idx + 1, A, B - element);

        current.remove(current.size() - 1);
        // dont pick
        helper(res, current, idx + 1, A, B);
    }
}
