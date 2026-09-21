class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int original=image[sr][sc];
        if(original!=color){
            dfs(image,sr,sc,color,original);
        }
        return image;

    }
    private void dfs(int[][] image,int row,int col,int color,int original ){
        if(row<0 || row>=image.length || col<0 || col>=image[0].length)return ;
        if(image[row][col]!=original) return;

        image[row][col]=color;
        dfs(image, row - 1, col, color, original); 
        dfs(image, row + 1, col, color, original); 
        dfs(image, row, col - 1, color, original);
        dfs(image, row, col + 1, color, original);

    }
}