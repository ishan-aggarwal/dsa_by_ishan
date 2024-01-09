package dynamic_programming.buy_sell_stock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
// Medium
// You are given an array prices where prices[i] is the price of a given stock on the ith day,
// and an integer fee representing a transaction fee.
// Find the maximum profit you can achieve. You may complete as many transactions as you like,
// but you need to pay the transaction fee for each transaction.
// Note:
// You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
// The transaction fee is only charged once for each stock purchase and sale.

public class BuySellStock5 {

    public static int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return calc(prices, 0, 1, dp, fee);
    }

    private static int calc(int[] prices, int index, int buy, int[][] dp, int fee) {
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
            return dp[index][buy] = Math.max(-prices[index] + calc(prices, index + 1, 0, dp, fee),
                    calc(prices, index + 1, 1, dp, fee));
        } else {
            // if we decide to sell now, then we add +ve value minus transaction fee, move to next index and next is to buy
            // or if we have not sold, then we move to next index and still want to sell it
            return dp[index][buy] = Math.max(prices[index] - fee + calc(prices, index + 1, 1, dp, fee),
                    calc(prices, index + 1, 0, dp, fee));
        }
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        System.out.println(maxProfit(prices, fee));
    }
}
