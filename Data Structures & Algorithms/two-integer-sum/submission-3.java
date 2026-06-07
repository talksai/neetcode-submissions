class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        int[] ins = new int[2];
        for (int i=0;i<nums.length;i++){
            int num =target-nums[i];
            if(hash.containsKey(num)){
                ins[0] = hash.get(num);
                ins[1] = i;
            }else
                hash.put(nums[i],i);
        }
        return ins;
    }
}
