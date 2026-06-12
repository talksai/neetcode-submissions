class Solution {
    public int removeDuplicates(int[] nums) {
       int res =1;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                res++;
                if(!queue.isEmpty()){
                    nums[queue.poll()]= nums[i];
                    queue.add(i);
                }
            }else {
                queue.add(i);
            }
        }
        return res;
    }
}