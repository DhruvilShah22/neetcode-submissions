class NumMatrix {

    int[][] valueMatrix;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        valueMatrix = new int[rows][cols];

        for(int row = 0; row < rows; row ++){
            int rowSum = 0;
            for(int col = 0; col < cols; col ++){
                rowSum += matrix[row][col];
                valueMatrix[row][col] = rowSum;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int row = row1; row <= row2; row++){
            int start = 0;
            if(col1 == 0){
                sum += valueMatrix[row][col2];
            }
            else{
                sum += valueMatrix[row][col2] - valueMatrix[row][col1 - 1];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */