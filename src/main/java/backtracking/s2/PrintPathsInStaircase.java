package backtracking.s2;

import java.util.ArrayList;

/**
 * Q2. Print paths in Staircase
 * Problem Description
 * You are climbing a staircase and it takes A steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * You need to return all the distinct ways to climb to the top in lexicographical order.
 * <p>
 * Problem Constraints
 * <p>
 * 2 <= A <= 25
 * <p>
 * Input Format
 * <p>
 * The first and the only argument contains an integer A, the number of steps.
 * <p>
 * Output Format
 * <p>
 * Return an 2-D Integer Array, which denotes all the unique valid paths to reach the top.
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = 2
 * Input 2:
 * <p>
 * A = 3
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * [ [1, 1], [2] ]
 * Output 2:
 * <p>
 * [ [1, 1, 1], [1, 2], [2, 1] ]
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * Distinct ways to reach top: 1 + 1, 2.
 * Explanation 2:
 * <p>
 * Distinct ways to reach top: 1 + 1 + 1, 1 + 2, 2 + 1.
 */


public class PrintPathsInStaircase {

    public static void main(String[] args) {
        PrintPathsInStaircase obj = new PrintPathsInStaircase();
        int A = 3;

        ArrayList<ArrayList<Integer>> result = obj.waysToClimb(A);
        System.out.println(result);
    }

    public ArrayList<ArrayList<Integer>> waysToClimb(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        helper(res, current, A);
        return res;
    }

    private static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> current, int A) {

        // base condition
        if (A == 0) {
            res.add(new ArrayList<>(current));
            return;
        }

        if (A < 0) {
            return;
        }

        // actual logic

        // logic to add 1 to the path
        current.add(1); // do part
        helper(res, current, A - 1); // recurse part
        current.remove(current.size() - 1); // undo part

        // logic to add 2 to the path
        current.add(2);
        helper(res, current, A - 2);
        current.remove(current.size() - 1);

    }
}
