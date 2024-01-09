package dynamic_programming.buy_sell_stock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

/**
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
 * in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BuySellStock1 {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        int ans = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int currentPrice : arr) {
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } else {
                ans = Math.max(ans, currentPrice - minPrice);
            }
        }
        return ans;
    }
}
