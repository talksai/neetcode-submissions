class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==1|| k==0)
            return false;
        int i = 0 ;
        int j =1;
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        if(set.contains(nums[1]))
            return true;
        set.add(nums[1]);
        while (i<j){
           int diff = (j-i);
           if(diff<k){
               if(j==nums.length-1){
                   set.remove(nums[i]);
                   i++;
               }else {
                   j++;
                   if(set.contains(nums[j])){
                       return true;
                   }else 
                       set.add(nums[j]);
               }
               
           }else {
                   set.remove(nums[i]);
                   i++;
               if(j < nums.length-1) {
                   j++;
                   if (set.contains(nums[j])) {
                       return true;
                   } else
                       set.add(nums[j]);
               }
               
           }
               
        }
        return false;
    }
}