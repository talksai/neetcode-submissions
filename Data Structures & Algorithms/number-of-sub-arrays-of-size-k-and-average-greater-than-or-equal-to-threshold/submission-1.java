class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int res =0;
        int i = 0;
        int j ;
        int sum = 0;
        for (j =0; j<k ;j++){
            sum = sum+arr[j];
        }
        j = j-1;
        
        while (j<arr.length){
            int avg = sum/k;
            if(avg >=threshold)
                res++;

            sum = sum -arr[i];
            i++;
            j++;
            if(j<arr.length)
                sum = sum +arr[j];
        }
        return res;
    }
}