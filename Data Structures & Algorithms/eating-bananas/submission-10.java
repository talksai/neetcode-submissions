class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int max  = -1;
        int min = 1;

        for (int pile: piles){
            max = Math.max(pile,max);
        }
        int resK =max;
        while (max>=min){
            long k =0;
            int midK  = min + (max-min) /2;
            if (midK == 0) midK = 1;
            for (int pile : piles) {
                k += (pile + (long)midK - 1) / midK;
            }
            if(k <= h){
                resK = midK;
                max = midK - 1;

            }else {
                min = midK +1;
            }

        }
        return resK;
    }
}
