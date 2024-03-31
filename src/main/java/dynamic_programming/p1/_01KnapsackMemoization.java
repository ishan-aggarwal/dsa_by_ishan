package dynamic_programming.p1;

public class _01KnapsackMemoization {

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;
        System.out.println(solve(wt, val, W));
    }

    private static int solve(int[] wt, int[] val, int W) {
        int len = wt.length;
        int[][] t = new int[len + 1][W + 1];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = -1;
            }
        }

        return solveM(wt, val, W, wt.length, t);
    }

    private static int solveM(int[] wt, int[] val, int W, int n, int[][] t) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (t[n][W] != -1) {
            return t[n][W];
        }

        if (wt[n - 1] <= W) {
            return t[n][W] = Math.max(
                    solveM(wt, val, W - wt[n - 1], n - 1, t) + val[n - 1],
                    solveM(wt, val, W, n - 1, t)
            );
        } else {
            return t[n][W] = solveM(wt, val, W, n - 1, t);
        }
    }
}
