class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
       boolean c0=true;boolean c1=true;boolean c2=true;boolean c3=true;
       int n=mat.length;
     for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (mat[r][c] != target[r][c]) c0 = false;
                if (mat[r][c] != target[c][n - 1 - r]) c1 = false;
                if (mat[r][c] != target[n - 1 - r][n - 1 - c]) c2 = false;
                if (mat[r][c] != target[n - 1 - c][r]) c3 = false;
            }
        } 
       return c0 || c1|| c2|| c3;
    }
}