package dynamic_programming.p1;

public class _01KnapsackTopDown {

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {50, 4, 5, 7};
        int W = 7;
        System.out.println(solve(wt, val, W));
    }

    private static int solve(int[] wt, int[] val, int w) {
        int n = wt.length;
        int[][] t = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }
}
