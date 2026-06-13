class Solution {
    public int trap(int[] height) {
        int[] rMax= new int[height.length];
        int cMax = height[height.length-1];
        int res = 0;
        for (int i = height.length-1;i>=0;i--){
            cMax =Math.max(cMax,height[i]);
            rMax[i] = cMax;
        }
        cMax = height[0];
        for (int i = 1;i<height.length-1;i++){
            cMax =Math.max(cMax,height[i]);
            int cRes = (Math.min(cMax,rMax[i]) )-height[i];
            if(cRes>0)
                res = res+cRes;
        }
        return res;
    }
}
