import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int maxMinRowVal = Integer.MIN_VALUE;
        int targetCol = -1;
        for (int i = 0; i < m; i++) {
            int rowMin = Integer.MAX_VALUE;
            int minCol = -1;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    minCol = j;
                }
            }

            if (rowMin > maxMinRowVal) {
                maxMinRowVal = rowMin;
                targetCol = minCol;
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][targetCol] > maxMinRowVal) {
                return new ArrayList<>(); 
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxMinRowVal);
        return result;
    }
}