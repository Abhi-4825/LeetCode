class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }



    private void bfs(char[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[r].length || grid[r][c]=='0') return;
        grid[r][c]='0';
        int [] row={0,0,1,-1};
        int [] col={1,-1,0,0};
        for(int i=0;i<4;i++){
            int newRow=r+row[i];
            int newCol=c+col[i];
            bfs(grid,newRow,newCol);
        }
    }
}