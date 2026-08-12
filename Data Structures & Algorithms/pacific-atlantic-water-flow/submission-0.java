class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] checkPacific = new boolean[rows][cols];
        boolean[][] checkAtlantic = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            checkPacific[i][0] = true;
        }

        for (int i = 0; i < cols; i++) {
            checkPacific[0][i] = true;
        }

        for (int i = 0; i < rows; i++) {
            checkAtlantic[i][cols - 1] = true;
        }

        for (int i = 0; i < cols; i++) {
            checkAtlantic[rows - 1][i] = true;
        }

        List<List<Integer>> islandsList = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                boolean[][] visitedPacific = new boolean[rows][cols];
                boolean canReachPacific = checkPassage(rows, cols, row, col, heights, checkPacific, visitedPacific);

                boolean[][] visitedAtlantic = new boolean[rows][cols];
                boolean canReachAtlantic = checkPassage(rows, cols, row, col, heights, checkAtlantic, visitedAtlantic);

                if (canReachPacific && canReachAtlantic) {
                    islandsList.add(Arrays.asList(row, col));
                }
            }
        }

        return islandsList;
    }

    private boolean checkPassage(int rows, int cols, int row, int col, int[][] heights, boolean[][] ocean, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return false;
        }

        if (visited[row][col]) {
            return false;
        }

        if (ocean[row][col]) {
            return true;
        }

        visited[row][col] = true;

        if (row > 0 && heights[row - 1][col] <= heights[row][col] && checkPassage(rows, cols, row - 1, col, heights, ocean, visited)) {
            return true;
        }

        if (row < rows - 1 && heights[row + 1][col] <= heights[row][col] && checkPassage(rows, cols, row + 1, col, heights, ocean, visited)) {
            return true;
        }

        if (col > 0 && heights[row][col - 1] <= heights[row][col] && checkPassage(rows, cols, row, col - 1, heights, ocean, visited )) {
            return true;
        }

        if (col < cols - 1 && heights[row][col + 1] <= heights[row][col] && checkPassage(rows, cols, row, col + 1, heights, ocean, visited)) {
            return true;
        }

        return false;
    }
}