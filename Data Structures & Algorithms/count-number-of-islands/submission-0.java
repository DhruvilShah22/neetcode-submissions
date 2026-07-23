class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] seen = new boolean[rows][cols];
        int count = 0;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == '1' && !seen[row][col]){
                    count ++;
                    checkIsland(grid, seen, rows, cols, row, col);
                }
            }
        }

        return count; 
    }

    private void checkIsland(char[][] grid, boolean[][] seen, int rows, int cols, int row, int col){
        if(grid[row][col] == '1' && !seen[row][col]){
            seen[row][col] = true;
            if(row > 0){
                checkIsland(grid, seen, rows, cols, row - 1, col);
            }
            if(row < rows - 1){
                checkIsland(grid, seen, rows, cols, row + 1, col);
            }
            if(col > 0){
                checkIsland(grid, seen, rows, cols, row, col - 1);
            }
            if(col < cols - 1){
                checkIsland(grid, seen, rows, cols, row, col + 1);
            }
        }
    }
}
