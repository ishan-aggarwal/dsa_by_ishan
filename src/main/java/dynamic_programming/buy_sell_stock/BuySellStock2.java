package dynamic_programming.buy_sell_stock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
// Medium
// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
// However, you can buy it then immediately sell it on the same day. -- this line does not make sense.
// Find and return the maximum profit you can achieve.

public class BuySellStock2 {

    public static int maxProfit(int[] prices) {
        // create a 2D dp array with the size as prices length and 2 (because we have two choices buy or sell)
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return calc(prices, 0, 1, dp);
    }

    private static int calc(int[] prices, int index, int buy, int[][] dp) {
        // base case
        if (index >= prices.length) {
            return 0;
        }

        // if the dp array already has the answer calculated
        if (dp[index][buy] != -1) return dp[index][buy];

        if (buy == 1) {
            return dp[index][buy] = Math.max(-prices[index] + calc(prices, index + 1, 0, dp), calc(prices, index + 1, 1, dp));
        } else {
            return dp[index][buy] = Math.max(prices[index] + calc(prices, index + 1, 1, dp), calc(prices, index + 1, 0, dp));
        }
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
