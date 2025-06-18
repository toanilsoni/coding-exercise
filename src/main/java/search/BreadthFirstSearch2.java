package search;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch2 {

	static Queue<Node> queue;

	public static class Node {

		public Node(int data) {
			this.data = data;
			this.neibours = new ArrayList<>();
		}

		int data;

		boolean isVisited;

		List<Node> neibours;

		public void addNeibours(Node node) {
			this.neibours.add(node);
		}

		public List<Node> getNeibours() {
			return neibours;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public boolean isVisited() {
			return isVisited;
		}

		public void setVisited(boolean isVisited) {
			this.isVisited = isVisited;
		}
	}

	public BreadthFirstSearch2() {
		queue = new LinkedList<Node>();
	}

	public static void main(String[] args) {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);

		node1.addNeibours(node2);
		node1.addNeibours(node3);
		node2.addNeibours(node4);
		node2.addNeibours(node5);
		node3.addNeibours(node6);
		node3.addNeibours(node7);

		BreadthFirstSearch2 bfs = new BreadthFirstSearch2();
		bfs.bfs(node1);
	}

	public static void bfs(Node startNode) {
		queue.add(startNode);
		startNode.isVisited = true;

		while (!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println(element.data);
			List<Node> neibours = element.getNeibours();

			for (Node neibour : startNode.getNeibours()) {
				if (neibour != null && neibour.isVisited == false) {
					queue.add(neibour);
					neibour.isVisited = true;					
				}
			}
		}
	}

}
