class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return Math.max(maxSubarraySum(nums),minSubarraySum(nums));
    }
     public int maxSubarraySum(int[] nums) {
        int res = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num: nums){
            currentSum = Math.max(currentSum+num,num);
            res = Math.max(res,currentSum);
        }
        return res;
    }

    public int minSubarraySum(int[] nums) {
        int res = Integer.MAX_VALUE;
        int currentSum = 0;
        int sum = 0;

        for (int num: nums){
            currentSum = Math.min(currentSum+num,num);
            res = Math.min(res,currentSum);
            sum = sum+num;
        }
        if(res == sum || sum< 0)
            return sum;
        return sum - res;
    }
}