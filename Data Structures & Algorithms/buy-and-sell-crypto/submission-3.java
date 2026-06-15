class Solution {
    public int maxProfit(int[] prices) {
         int min = prices[0];
        int res = 0;
        for (int r =1;r<prices.length;r++){
            res = Math.max(res,prices[r]- min);
            min = Math.min(min,prices[r]);
        }
        return res;
    }
}
