package list;

import java.util.NoSuchElementException;

public class LinkedList {

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;

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

	public void addFirst(int value) {
		Node node = new Node(value);
		if (first == null) {
			first = node;
			last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item) {
				return index;
			}
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
		if (first == null) {
			throw new NoSuchElementException();
		}
		if (first == last) {
			first = null;
			last = null;
			return;
		}
		Node second = first.next;
		first.next = null;
		first = second;
	}

	public void removeLast() {
		Node previous = getPreviousNode(last);
		last = previous;
		last.next = null;
	}
	
	private Node getPreviousNode(Node node){
		Node currentNode = first;

		while (currentNode != null) {
			if(currentNode.next == node) return currentNode;
			currentNode = currentNode.next;
		}
		return null;
	}
}
