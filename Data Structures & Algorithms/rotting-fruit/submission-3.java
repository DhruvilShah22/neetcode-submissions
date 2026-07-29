class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int mins = 0;
        int countFresh = 0;

        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j ++){
                if(grid[i][j] == 1){
                    countFresh++;
                }
            }
        }
        if(countFresh == 0){
            return 0;
        }
        List<int[]> indexToChange = null;
        do{
            indexToChange = new ArrayList<>();
            for(int row = 0; row < rows; row ++){
                for(int col = 0; col < cols; col++){
                    if(grid[row][col] == 2){
                        if(row > 0 && grid[row-1][col] == 1){
                            indexToChange.add(new int[]{row-1, col});
                        }
                        if(row < rows - 1 && grid[row+1][col] == 1){
                            indexToChange.add(new int[]{row+1, col});
                        }
                        if(col > 0 && grid[row][col-1] == 1){
                            indexToChange.add(new int[]{row, col-1});
                        }
                        if(col < cols - 1 && grid[row][col+1] == 1){
                            indexToChange.add(new int[]{row, col+1});
                        }
                    }
                }
            }
            mins++;
            for(int[] a : indexToChange){
                if(grid[a[0]][a[1]] == 1){
                    grid[a[0]][a[1]] = 2;
                    countFresh--;
                }
            }
        }
        while(indexToChange.size() > 0 && countFresh > 0);
        
        if(countFresh > 0){
            return -1;
        }
        return mins;
    }
}
