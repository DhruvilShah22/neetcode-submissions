class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board.length != 9){
            return false;
        }
        HashSet<Character> set = null;
        for(int row = 0; row < 9; row ++){
            int cols = board[row].length;
            if(cols != 9){
                return false;
            }
            set = new HashSet<>();
            for(int col = 0; col < cols; col ++){
                if(board[row][col] != '.'){
                    if(set.contains(board[row][col])){
                        return false;
                    }
                    set.add(board[row][col]);
                }
            }
        }

        for(int col = 0; col < 9; col ++){
            set = new HashSet<>();
            for(int row = 0; row < 9; row ++){
                if(board[row][col] != '.'){
                    if(set.contains(board[row][col])){
                        return false;
                    }
                    set.add(board[row][col]);
                }
            }
        }
        for(int rowStart = 0; rowStart < 9; rowStart+=3){
            for(int colStart = 0; colStart < 9; colStart+=3){
                set = new HashSet<>();
                for(int row = 0; row < 3; row ++){
                    for(int col = 0; col < 3; col ++){
                        int cRow = row + rowStart;
                        int cCol = col + colStart;
                        if(board[cRow][cCol] != '.'){
                            if(set.contains(board[cRow][cCol])){
                                return false;
                            }
                            set.add(board[cRow][cCol]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
