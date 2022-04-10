package search;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

	static Queue<Node> queue;

	static class Node {
		int data;
		boolean visited;
		List<Node> neigbours;

		public Node(int data) {
			this.data = data;
			this.neigbours = new ArrayList<>();
		}

		public void setNeighbours(List<Node> neigbours) {
			this.neigbours = neigbours;
		}

		public List<Node> getNeighbours() {
			return neigbours;
		}

		public void addNeighbours(Node node) {
			this.neigbours.add(node);
		}
	}

	public BreadthFirstSearch() {
		queue = new LinkedList<Node>();
	}

	public void bfs(Node start) {

		// System.out.println(start.data);

		queue.add(start);
		start.visited = true;

		while (!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println(element.data);
			List<Node> neibours = element.getNeighbours();

			for (int i = 0; neibours.size() > i; i++) {

				if (neibours.get(i) != null & !neibours.get(i).visited) {
					queue.add(neibours.get(i));
					neibours.get(i).visited = true;

				}
			}

		}
	}

	public static void main(String arg[]) {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		node1.addNeighbours(node2);
		node1.addNeighbours(node3);
		node2.addNeighbours(node4);
		node2.addNeighbours(node5);

		BreadthFirstSearch bfs = new BreadthFirstSearch();

		bfs.bfs(node1);

	}

}
