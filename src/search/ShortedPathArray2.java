//https://www.geeksforgeeks.org/shortest-distance-two-cells-matrix-grid/

package search;
import java.util.LinkedList;
import java.util.Queue;

public class ShortedPathArray2 {

	static class QItem {
		int row;
		int col;
		int distanceFromSource;

		public QItem(int row, int col, int distanceFromSource) {
			this.row = row;
			this.col = col;
			this.distanceFromSource = distanceFromSource;
		}

	}
	public static void main(String[] args) {

		char [] [] grid = {{ '*', '*', '0', 's'},
				         { '*', '*', '0', '*' },
				         { '*', '*', '0', '*' },
				         { 'd', '*', '*', '*' },
				         };

		System.out.println(pathExists(grid));
	}

	public static int pathExists(char[][] grid) {
		
		QItem source = new QItem(0, 0, 0);

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 's') {
					source.row = i;
					source.col = j;
					break;
					// System.out.println(i + "" + j);
				}

			}
		}
		
		Queue<QItem> queue = new LinkedList<>();
		queue.add(new QItem(source.row, source.col, 0));
		
		boolean [] [] visited = new boolean [grid.length] [grid[0].length];
		visited[source.row][source.col] = true;
		
		
		while (!queue.isEmpty()) {
			QItem q = queue.remove();

			if (grid[q.row][q.col] == 'd') {
				return q.distanceFromSource;
			}

			// moving up
			if (isValid(q.row - 1, q.col, grid, visited)) {
				queue.add(new QItem(q.row - 1, q.col, q.distanceFromSource + 1));
				visited[q.row - 1][q.col] = true;
			}

			// moving down
			if (isValid(q.row + 1, q.col, grid, visited)) {
				queue.add(new QItem(q.row + 1, q.col, q.distanceFromSource + 1));
				visited[q.row + 1][q.col] = true;
			}

			// moving left
			if (isValid(q.row, q.col - 1, grid, visited)) {
				queue.add(new QItem(q.row, q.col-1, q.distanceFromSource + 1));
			}

			// moving right
			if (isValid(q.row, q.col + 1, grid, visited)) {
				queue.add(new QItem(q.row, q.col + 1, q.distanceFromSource + 1));
				visited[q.row][q.col + 1] = true;
			}

		}

		return -1;
	}
	
	static boolean isValid(int x, int y, char[][] grid, boolean[][] visited) {
		if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != '0' && visited[x][y] == false) {
			return true;
		}
		return false;
	}

}
