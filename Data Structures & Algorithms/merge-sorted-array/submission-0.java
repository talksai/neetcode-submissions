class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newMer = new int[m+n];
        int currindex = 0;
        int currn = 0;
        int in =0;
        while (currindex < m && currn <n ){
            if(nums1[currindex] < nums2[currn]){
                newMer[in] = nums1[currindex];
                currindex++;
            }else {
                newMer[in] = nums2[currn];
                currn++;
            }
            in++;
        }
        if(currindex < m){
            while (currindex < m){
                newMer[in] = nums1[currindex];
                currindex++;
                in ++;
            }
        }else if(currn < n){
            while (currn < n){
                newMer[in] = nums2[currn];
                currn++;
                in ++;
            }
        }
        for (int i = 0; i < newMer.length; i++){
            nums1[i] = newMer[i];
        }
    }
}