class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1  || grid[grid.length - 1][grid.length - 1] == 1)
            return -1;
        boolean[][] isLandVisit = new boolean[grid.length][grid[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        isLandVisit[0][0] = true;
        int distance =1;
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1}, 
                {0, -1},{0, 1}, 
                {1, -1},{1, 0},{1, 1}};
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i =0 ;i < size ;i++){
                int[] poll = queue.poll();
                int pollRow = poll[0];
                int pollC = poll[1];
                if(pollRow ==grid.length - 1 && pollC ==grid.length - 1)
                    return distance;

                for (int[] dir : directions) {
                    int newRow = pollRow + dir[0];
                    int newCol = pollC + dir[1];

                    if (newRow >= 0 && newRow < grid.length &&
                            newCol >= 0 && newCol < grid.length &&
                            grid[newRow][newCol] == 0 &&
                            !isLandVisit[newRow][newCol]) {

                        isLandVisit[newRow][newCol] = true;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
            distance++;
        }
        return -1; 
    }
}