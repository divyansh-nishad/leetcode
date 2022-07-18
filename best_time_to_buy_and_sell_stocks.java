public class best_time_to_buy_and_sell_stocks {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

}
