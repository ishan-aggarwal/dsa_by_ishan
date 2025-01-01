package backtracking.s2;

import java.util.ArrayList;

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
