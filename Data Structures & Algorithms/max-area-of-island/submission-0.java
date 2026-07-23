class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == 1){
                    maxArea = Math.max(maxArea, getArea(grid, rows, cols, row, col, 0));
                }
            }
        }
        return maxArea;
    }

    private int getArea(int[][] grid, int rows, int cols, int row, int col, int area){
        if(grid[row][col] == 0){
            return area;
        }
        grid[row][col] = 0;
        area++;
        if(row > 0){
            area = getArea(grid, rows, cols, row - 1, col, area);
        }
        if(col > 0){
            area = getArea(grid, rows, cols, row, col - 1, area);
        }
        if(row < rows - 1){
            area = getArea(grid, rows, cols, row + 1, col, area);
        }
        if(col < cols - 1){
            area = getArea(grid, rows, cols, row, col + 1, area);
        }
        return area;
    }
}
