package dynamic_programming.p1;

public class _02SubsetSumEqualsK {

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 9, 10};
        int sum = 11;

        System.out.println(solve(arr, sum));
    }

    private static boolean solve(int[] arr, int W) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][W + 1];
        return isSubsetSumPresent(arr, W, n, dp);
    }

    private static boolean isSubsetSumPresent(int[] arr, int W, int n, boolean[][] dp) {

        // when there are no elements present in the input i.e. i = 0;
        // we want to form some weight - it is not possible
        for (int j = 1; j < W + 1; j++) {
            dp[0][j] = false;
        }

        // when the Weight is 0; then there is a possibility of choosing empty subset irrespective of how many elements are there
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    // If the current element can be included in the subset
                    // Then find the subset with sum `j` by excluding or including the i'th item
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    // If the current element is greater than the sum, exclude it
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }
}
