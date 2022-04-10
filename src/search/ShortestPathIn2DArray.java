//https://www.geeksforgeeks.org/shortest-distance-two-cells-matrix-grid/

package search;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathIn2DArray {

	static class Node {
		int row;
		int col;
		int distance;

		Node(int row, int col, int distance) {
			this.row = row;
			this.col = col;
			this.distance = distance;
		}
	}

	public static void main(String[] args) {

		char[][] grid = { { '0', '*', '0', 's' },
				          { '*', '0', '*', '*' }, 
				          { '0', '*', '*', '*' },
				          { '0', '*', '*', 'd' } };
		
		/*char[][] grid = {{'0', '*', '0', 's'},
		         {'*', '0', '*', '*'},
		         {'0', '*', '*', '*'},
		         {'d', '0', '0', '0'}};*/

		System.out.println(shortestPath(grid));
	}

	public static int shortestPath(char[][] grid) {

		Node source = new Node(0, 0, 0);

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 's') {
					source.row = i;
					source.col = j;
					break;
				}
			}

		}
		System.out.println("Source Row : " + source.row + "\n" + "Source Col : " + source.col);

		Queue<Node> queue = new LinkedList<Node>();

		queue.add(new Node(source.row, source.col, 0));

		boolean[][] visited = new boolean[grid.length][grid[0].length];
		visited[source.row][source.col] = true;

		while (!queue.isEmpty()) {

			Node element = queue.remove();

			if (grid[element.row][element.col] == 'd') {
				return element.distance;
			}

			// moving up
			if (isValid(element.row - 1, element.col, grid, visited)) {
				queue.add(new Node(element.row - 1, element.col, element.distance + 1));
				visited[element.row - 1][element.col] = true;
			}

			// moving down
			if (isValid(element.row + 1, element.col, grid, visited)) {
				queue.add(new Node(element.row + 1, element.col, element.distance + 1));
				visited[element.row + 1][element.col] = true;
			}

			// moving left
			if (isValid(element.row, element.col - 1, grid, visited)) {
				queue.add(new Node(element.row, element.col - 1, element.distance + 1));
				visited[element.row][element.col - 1] = true;
			}

			// moving right
			if (isValid(element.row, element.col + 1, grid, visited)) {
				queue.add(new Node(element.row, element.col + 1, element.distance + 1));
				visited[element.row][element.col + 1] = true;
			}

		}

		return -1;

	}

	public static boolean isValid(int x, int y, char[][] grid, boolean[][] visited) {

		if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != '0' && visited[x][y] == false) {
			return true;
		}
		return false;
	}
}
