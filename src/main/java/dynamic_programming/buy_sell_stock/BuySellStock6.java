package dynamic_programming.buy_sell_stock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
// Medium
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// Find the maximum profit you can achieve. You may complete as many transactions as you like
// (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
// After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before
// you buy again).

public class BuySellStock6 {

    public static int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return calc(prices, 0, 1, dp);
    }

    private static int calc(int[] prices, int index, int buy, int[][] dp) {
        // base condition
        // where the index reached the end
        if (index >= prices.length) {
            return 0;
        }
        // if the value is already calculated then return it
        if (dp[index][buy] != -1) {
            return dp[index][buy];
        }

        // since we want to buy first
        if (buy == 1) {
            // if we decide to buy then we add -ve value , move to next index and next we want to sell or
            // it we don't decide to buy so we move to next index, along with still buy plan
            return dp[index][buy] = Math.max(-prices[index] + calc(prices, index + 1, 0, dp),
                    calc(prices, index + 1, 1, dp));
        } else {
            // if we decide to sell now, then we add +ve value, move to next index (+1 for cooldown) and next is to buy
            // or if we have not sold, then we move to next index and still want to sell it
            return dp[index][buy] = Math.max(prices[index] + calc(prices, index + 2, 1, dp),
                    calc(prices, index + 1, 0, dp));
        }
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println(maxProfit(prices));
    }
}
