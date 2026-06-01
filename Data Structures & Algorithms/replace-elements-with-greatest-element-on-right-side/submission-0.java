class Solution {
    public int[] replaceElements(int[] arr) {
         int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for (int i = arr.length-1; i>0 ;i--){
            int maxC =  Math.max(max,arr[i-1]);
            arr[i-1] = Math.max(max,arr[i]);
            max = maxC;
            
        }
        return arr;
    }
}