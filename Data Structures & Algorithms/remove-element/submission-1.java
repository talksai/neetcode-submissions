class Solution {
    public int removeElement(int[] nums, int val) {
        int startPointer = 0;
        int endPointer = nums.length-1;
        int total  = nums.length;

        while (startPointer<=endPointer){
            if(nums[startPointer] == val){
                nums[startPointer] = nums[endPointer] ;
                endPointer -- ;
                total --;
            }else {
                startPointer ++;
            }
        }
        return total; 
    }
}