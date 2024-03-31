package dynamic_programming.p1;

import java.util.Arrays;

public class _03EqualSumPartition {

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        int sum = Arrays.stream(arr).sum();
        if (sum % 2 == 1) {
            System.out.println("Not possible");
            return;
        }
        int W = sum / 2;
        System.out.println(solve(arr, W));
    }

    private static boolean solve(int[] arr, int W) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][W + 1];
        return isEqualSumPartitionPresent(arr, n, W, dp);
    }

    private static boolean isEqualSumPartitionPresent(int[] arr, int n, int W, boolean[][] dp) {

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int j = 1; j < W + 1; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }
}
