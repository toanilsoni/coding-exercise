package array.twodimensional;

public class MaxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Traverse each cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If land is found, calculate the area
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    // DFS to calculate area of connected land
    private static int dfs(int[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Return 0 if out of bounds or cell is water
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0)
            return 0;

        grid[i][j] = 0; // Mark as visited
        int area = 1;   // Count this cell

        // Recursively visit all 4 directions
        area += dfs(grid, i + 1, j); // down
        area += dfs(grid, i - 1, j); // up
        area += dfs(grid, i, j + 1); // right
        area += dfs(grid, i, j - 1); // left

        return area;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println("Maximum island area: " + maxAreaOfIsland(grid));
    }
}

