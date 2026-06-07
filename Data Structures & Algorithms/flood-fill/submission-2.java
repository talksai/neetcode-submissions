class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color, int originalPixel) {
        if( sr<0 || sr>= image.length || sc < 0 || sc>= image[sr].length){
            return image;
        }
        if(image[sr][sc] != originalPixel){
            return image;
        }
        image[sr][sc] = color;
        floodFill(image,sr,sc-1,color,originalPixel);
        floodFill(image,sr,sc+1,color,originalPixel);
        floodFill(image,sr-1,sc,color,originalPixel);
        floodFill(image,sr+1,sc,color,originalPixel);
        return image;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        return floodFill(image,sr,sc,color,image[sr][sc]);
    }
}