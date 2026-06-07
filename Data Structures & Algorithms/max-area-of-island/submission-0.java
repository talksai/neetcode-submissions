class Solution {
    public void maxAreaOfIsland(int[][] grid,int sr, int sc, boolean[][] isLandVisit, int[] size) {
        if(sr<0 || sr>=grid.length ||sc<0 || sc>=grid[0].length ){
            return;
        }
        if(isLandVisit[sr][sc])
            return;
        if(grid[sr][sc]==0)
            return;

        size[0] = size[0]+1;
        isLandVisit[sr][sc] = true;
        maxAreaOfIsland(grid,sr,sc+1,isLandVisit,size);
        maxAreaOfIsland(grid,sr,sc-1,isLandVisit,size);
        maxAreaOfIsland(grid,sr+1,sc,isLandVisit,size);
        maxAreaOfIsland(grid,sr-1,sc,isLandVisit,size);
    }

    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length ==0){
            return 0;
        }
        int res = 0;
        boolean[][] isLandVisit = new boolean[grid.length][grid[0].length];
        for (int i = 0 ; i< grid.length;i++){
            for (int j = 0 ; j< grid[i].length;j++){
                if(grid[i][j]==1 && !isLandVisit[i][j]){
                    int[] size = new int[1];
                    maxAreaOfIsland(grid,i,j,isLandVisit,size);
                   res = Math.max(res,size[0]);
                }
            }
        }
        return res;
    }
}
