class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0;
        int j=mat.length-1;
        int k=0;
        int sum=0;
        while(k<mat.length){
            if(k!=j)
           sum+=mat[k][i];
           sum+=mat[k][j];
           i++;
           j--;
           k++;
        }
        return sum;
    }
}