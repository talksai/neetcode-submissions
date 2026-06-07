class Solution {
    public int orangesRotting(int[][] grid) {
        int res = 0;
        int fresh = 0;
        boolean[][] isLandVisit = new boolean[grid.length][grid[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0 ; i< grid.length;i++){
            for (int j = 0 ; j< grid[i].length;j++) {
                if(grid[i][j]==2) {
                    queue.offer(new int[]{i, j});
                    isLandVisit[i][j] = true;
                }else if(grid[i][j]==1) {
                    fresh++;
                }
            }
        }

        int[][] canVisit = {{0,1},{0,-1},{1,0},{-1,0}};

        while (!queue.isEmpty()){
            int size = queue.size();
            boolean isRotting =false;
            for (int i = 0 ; i< size;i++){
                int[] poll =  queue.poll();
                for (int j =0 ;j<canVisit.length;j++){
                    int row = poll[0] + canVisit[j][0];
                    int col = poll[1] + canVisit[j][1];
                    if(row>=0 && row < grid.length &&col>=0 && col < grid[row].length && grid[row][col] ==1 && !isLandVisit[row][col] ){
                        isLandVisit[row][col] = true;
                        queue.offer(new int[]{row, col});
                        isRotting = true;
                        fresh--;
                    }
                }
            }
            if(isRotting)
                res++;
        }
        return fresh==0?res:-1;
    }
}