class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int leftm = 0;
        int rightn = matrix.length-1;
        int inMatrix =-1;
        while (leftm<=rightn){
            int mid  = (leftm+rightn)/2;
            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length-1]){
                inMatrix = mid;
                break;
            }
            if(matrix[mid][0] > target ){
                rightn = mid - 1;
            }else if(target > matrix[mid][matrix[mid].length-1]) {
                leftm =mid+1;
            }
        }
        if(inMatrix ==-1)
            return false;

        int l = 0;
        int r = matrix[inMatrix].length-1;
        while (l<=r){
            int mid  = (l+r)/2;
            if(matrix[inMatrix][mid]==target)
                return true;
            if(matrix[inMatrix][mid] < target){
                l = mid+1;
            }else if(matrix[inMatrix][mid] > target){
                r = mid-1;
            }
        }
        return false;
    }
}
