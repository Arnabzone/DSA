class Solution {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxP = 0;

        for (int price : prices) {
            if (price < minP) {
                minP = price; 
            } else {
                int profit = price - minP;
                maxP = Math.max(maxP, profit);
            }
        }

        return maxP; 
    }
}
