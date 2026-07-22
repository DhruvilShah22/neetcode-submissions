class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length - 1;
        int start = 0;
        int end = matrix.length - 1;
        int row = 0;

        while(start <= end){
            row = start + (end - start) / 2;
            if(matrix[row][0] <= target && matrix[row][cols] >= target){
                break;
            }
            else if(matrix[row][cols] <= target){
                start = row + 1;
            }
            else{
                end = row - 1;
            }
        }
        start = 0;
        end = cols;
        while(start <= end){
            int col = start + (end - start) / 2;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                start = col + 1;
            }
            else{
                end = col - 1;
            }
        }

        return false;
    }
}
