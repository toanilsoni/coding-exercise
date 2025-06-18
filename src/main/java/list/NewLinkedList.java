package list;

public class NewLinkedList {

	private class Node {
		private int value;
		private Node next;

		private Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;

	public void addFirst(int item) {
		Node node = new Node(item);
		if (first == null) {
			first = node;
			last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	public void addLast(int item) {
		Node node = new Node(item);
		if (first == null) {
			first = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public int indexOf(int value) {
		Node current = first;
		int index = 0;
		while (current != null) {
			if (current.value == value)
				return index;
			current = current.next;
			index++;
		}
		return -1;
	}

	public boolean contains(int item) {
		Node current = first;
		while (current != null) {
			if (current.value == item) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void removeFirst() {
		Node second = first.next;
		first.next = null;
		first = second;
	}

	public void removeLast() {
		Node current = first;
		while (current != null) {
			if (current.next == last) break;
			current = current.next;
			{
				Node secondLast = current.next;
				last = null;
				last = secondLast;
			}
		}
		
		
	}
}
