package array.twodimensional;

public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Traverse the entire grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Found an unvisited land cell
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);  // Mark all connected land
                }
            }
        }
        return count;
    }

    // Depth-First Search to mark connected land
    private static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Boundary and water checks
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') return;

        grid[i][j] = '0'; // Mark as visited

        // Visit all 4 adjacent cells
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }

    // Example usage
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int islands = numIslands(grid);
        System.out.println("Number of islands: " + islands);
    }
}

