class Solution {
    public int numIslands(char[][] grid) {
         if(grid==null || grid.length==0) return 0;
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,i,j,n,m);
                }
            }
        }  return count;
    }
        
  private void bfs(char[][] grid,int row,int col ,int maxRow,int maxCol){
      if(row>=maxRow || row<0 || col<0 || col>=maxCol || grid[row][col]=='0') return;
      grid[row][col]='0';
      int [] addRow={-1,1,0,0};
      int [] addCol={0,0,1,-1};
      for(int i=0;i<4;i++){
         int newRow=row+addRow[i];
         int newCol=col+addCol[i];
          bfs(grid,newRow,newCol,maxRow,maxCol);
      }
  }
}