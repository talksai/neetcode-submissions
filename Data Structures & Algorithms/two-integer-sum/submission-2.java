class Solution {
    public int[] twoSum(int[] nums, int target) {
          Map<Integer,Integer> hash = new HashMap<>();
        int[] ins  = new int[2];
        for (int i=0;i<nums.length;i++){
            hash.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
             int num =target-nums[i];
            if(hash.containsKey(num) && i!=hash.get(num) ){
                ins[0] = Math.min(i,hash.get(num));
                ins[1] = Math.max(i,hash.get(num));
            }
        }
        return ins;
    }
}
