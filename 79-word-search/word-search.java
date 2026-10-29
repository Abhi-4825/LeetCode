class Solution {
    public boolean exist(char[][] board, String word) {
       for(int i=0;i<board.length;i++ ){
        for(int j=0;j<board[i].length;j++){
           if(check(board,word,i,j,0)) return true; 
        }
        
       }
         return false;
    }
    



   private boolean check(char[][] board, String word,
                          int row, int col, int wordIndex) {
        if (wordIndex == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length ||
            board[row][col] != word.charAt(wordIndex)) {

            return false;
        }

      
        char temp = board[row][col];
        board[row][col] = '#';

        int[] r = {1, -1, 0, 0};
        int[] c = {0, 0, 1, -1};

        for (int i = 0; i < 4; i++) {

            int newRow = row + r[i];
            int newCol = col + c[i];

            if (check(board, word, newRow, newCol, wordIndex + 1)) {
                board[row][col] = temp;
                return true;
            }
        }

        board[row][col] = temp;

        return false;
    }
}