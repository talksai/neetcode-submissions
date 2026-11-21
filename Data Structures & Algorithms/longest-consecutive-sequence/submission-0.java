class Solution {
    public int longestConsecutive(int[] nums) {
           int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums){
            set.add(num);
        }
        int best = 0;
        for (int num: set){
            if(!set.contains(num-1)){
                int cur = num;
                int len = 0;
                while (set.contains(cur)){
                    cur = cur+1;
                    len++;
                }
                best = Math.max(best, len);
            }
        }
        
        
        return best;
    }
}
