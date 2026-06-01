class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0 ;
        int currentConsecutiveOnes = 0 ;
        for (int num: nums){
            if(num == 1){
                currentConsecutiveOnes++;
            }else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes) ;
                currentConsecutiveOnes = 0;
            }
        }
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes) ;
        return maxConsecutiveOnes;
    }
}