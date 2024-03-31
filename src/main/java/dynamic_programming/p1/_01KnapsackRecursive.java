package dynamic_programming.p1;

public class _01KnapsackRecursive {


    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;
        System.out.println(solve(wt, val, W));
    }

    private static int solve(int[] wt, int[] val, int W) {
        return solveR(wt, val, W, wt.length);
    }

    private static int solveR(int[] wt, int[] val, int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {
            return Math.max(
                    solveR(wt, val, W - wt[n - 1], n - 1) + val[n - 1],
                    solveR(wt, val, W, n - 1)
            );
        } else {
            return solveR(wt, val, W, n - 1);
        }
    }
}
