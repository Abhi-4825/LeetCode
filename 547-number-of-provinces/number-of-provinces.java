class Solution {
   
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] visited=new boolean[isConnected.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i])
            {count++;
            dfs(i,isConnected,visited);}
        }
        return count;
    }
    private void dfs(int vertex,int[][] isConnected,boolean[] visited){
         if(!visited[vertex]){
            visited[vertex]=true;
            for(int j=0;j<isConnected[vertex].length;j++){
                 if(isConnected[vertex][j]==1)
                  dfs(j,isConnected,visited);
            }
         }
    }
}