class Solution {
    public void rotate(int[][] matrix) {
          
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            } 
        }
            for(int i=0;i<matrix.length;i++){
                int f=0;
                int b=matrix[i].length-1;
                while(f<b){
                    int temp=matrix[i][f];
                    matrix[i][f]=matrix[i][b];
                    matrix[i][b]=temp;
                    f++;
                    b--;
                }
           }



    }
    
}