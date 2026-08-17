class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean flagRow = false;
        boolean flagCol = false;

        for(int row = 0; row < rows; row ++){
            if(matrix[row][0] == 0){
                flagRow = true;
                break;
            }
        }
        
        for(int col = 0; col < cols; col ++){
            if(matrix[0][col] == 0){
                flagCol = true;
            }
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for(int col = 1; col < cols; col ++){
            if(matrix[0][col] == 0){
                for(int row = 1; row < rows; row ++){
                    matrix[row][col] = 0;
                }
            }
        }

        for(int row = 1; row < rows; row ++){
            if(matrix[row][0] == 0){
                for(int col = 1; col < cols; col++){
                    matrix[row][col] = 0;
                }
            }
        }

        if(flagRow){
            for(int row = 0; row < rows; row ++){
                matrix[row][0] = 0;
            }
        }
        if(flagCol){
            for(int col = 0; col < cols; col ++){
                matrix[0][col] = 0;
            }
        }

    }
}