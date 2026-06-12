class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength =Integer.MAX_VALUE;
        int i=0,j=0;
        int sum  = 0;
        for (j =0 ;j<nums.length;j++){
            sum = sum+nums[j];
            while (target<=sum){
                minLength = Math.min(minLength,j-i+1);
                sum = sum-nums[i];
                i++;
                
            }
        }
        return minLength == Integer.MAX_VALUE?0:minLength;
    }
}