// Leetcode 121. Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package Arrays.TwoPointer;

public class StockBuyAndSell {

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }

            if (prices[i] > buy) {
                profit = Math.max(profit, prices[i] - buy);
            }
        }

        return profit;
    }
}
