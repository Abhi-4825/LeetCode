class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                q.offer(new Pair(i,j,0));
                if(grid[i][j]==1) fresh++;
            }
        }
        int converted=0;
        int maxTime=0;
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.row();
            int c=curr.col();
            int time=curr.time();
            maxTime=Math.max(time,maxTime);
            int[] dRow={0,0,1,-1};
            int[] dCol={1,-1,0,0};
            for(int i=0;i<4;i++){
                int newRow=r+dRow[i];
                int newCol=c+dCol[i];
                if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && grid[newRow][newCol]==1){
                    q.offer(new Pair(newRow,newCol,time+1));
                    grid[newRow][newCol]=2;
                    converted++;
                }
            }
        }
        return converted==fresh? maxTime:-1;
    }
}
record Pair(int row,int col,int time){}