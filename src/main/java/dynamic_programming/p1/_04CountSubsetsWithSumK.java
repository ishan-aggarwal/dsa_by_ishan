package dynamic_programming.p1;

import java.util.Arrays;

public class _04CountSubsetsWithSumK {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 10};
        int sum = 11;

        System.out.println(solve(arr, sum));
    }

    private static int solve(int[] arr, int sum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], 0);
        }
        return countSubsets(arr, sum, n, dp);
    }

    private static int countSubsets(int[] arr, int W, int n, int[][] dp) {
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < W + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }
}
