class Solution {
    public void sortColors(int[] nums) {
         int [] val = {0,0,0};
        for (int i =0 ; nums.length>i ;i++){
            val[nums[i]] = val[nums[i]]+1;
        }
        int index = 0;
        for (int i =0 ; val.length>i ;i++){
            for( int j =0 ; j<val[i] ;j++){
                nums[index] = i;
                index++;
            }
        }
    }
}