class Solution {
    public int[] productExceptSelf(int[] nums) {
         int[] lsum = new  int[nums.length];
        int[] rsum = new  int[nums.length];
        int[] res = new  int[nums.length];
        int lPoduct = 1;
        int rPoduct = 1;
        for (int i = 0;i<nums.length;i++){
            lsum[i] = lPoduct * nums[i];
            lPoduct= lsum[i];
        }
        for (int i = nums.length-1;i>=0;i--){
            rsum[i] = rPoduct * nums[i];
            rPoduct = rsum[i];
        }
        for (int i = 0;i<nums.length;i++){
            if(i ==0){
                res[i] = rsum[i+1];
            }
            else if(i ==nums.length-1){
                res[i] = lsum[i-1];
            }
            else {
                res[i] = rsum[i+1] * lsum[i-1];
            }

        }
        return res;
    }
}  
