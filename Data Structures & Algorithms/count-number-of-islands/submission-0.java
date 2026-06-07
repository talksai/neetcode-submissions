class Solution {
     public int numIslands(char[][] grid) {
        int isLand = 0 ;
        if(grid.length ==0){
            return 0;
        }
        boolean[][] isLandVisit = new boolean[grid.length][grid[0].length];
        for (int i = 0 ; i< grid.length;i++){
            for (int j = 0 ; j< grid[i].length;j++){
                if(grid[i][j]=='1' && !isLandVisit[i][j]){
                    numIslands(grid,i,j,isLandVisit);
                    isLand++;
                }
            }
        }
        return isLand;

    }
    public void numIslands(char[][] grid,int sr, int sc, boolean[][] isLandVisit) {
        if( sr<0 || sr>= grid.length || sc < 0 || sc>= grid[sr].length){
            return;
        }
        if(grid[sr][sc]=='0')
            return;
        if(isLandVisit[sr][sc])
            return;
        isLandVisit[sr][sc] = true;
        numIslands(grid,sr,sc-1,isLandVisit);
        numIslands(grid,sr,sc+1,isLandVisit);
        numIslands(grid,sr-1,sc,isLandVisit);
        numIslands(grid,sr+1,sc,isLandVisit);
    }
}
