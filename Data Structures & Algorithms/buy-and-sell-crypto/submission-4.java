class Solution {
    public int maxProfit(int[] prices) {
         int[] rMax =  new int[prices.length];
        int rMaxNumber = rMax[prices.length-1];

        for (int i = prices.length-1 ;i>=0;i--){
            rMaxNumber = Math.max(rMaxNumber,prices[i]);
            rMax[i] = rMaxNumber;
        }
        int res = 0;
        int rMinNumber = prices[0];
        for (int i = 0 ;i< prices.length;i++){
            rMinNumber = Math.min(rMinNumber,prices[i]);
            int tempRes =  rMax[i] - rMinNumber;
            if(tempRes>0)
                res =Math.max(res,tempRes);
        }  
        
        return res;
    }
}
