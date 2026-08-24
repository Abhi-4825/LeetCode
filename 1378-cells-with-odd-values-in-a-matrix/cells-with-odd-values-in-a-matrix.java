class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] row=new boolean[m];
        boolean[] column=new boolean[n];


        for(int[] in:indices){
            row[in[0]]=!row[in[0]];
            column[in[1]]=!column[in[1]];
        }
        int rowCount=0;
        for(boolean r:row){
            if(r) rowCount++;
        }
         int columnCount=0;
        for(boolean c:column){
            if(c) columnCount++;
        }
        return rowCount*(n-columnCount) + columnCount*(m-rowCount);

    }
}