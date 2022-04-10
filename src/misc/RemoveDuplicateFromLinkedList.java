package misc;
//https://practice.geeksforgeeks.org/problems/change-the-string3541/1/?company[]=Oracle&company[]=Oracle&page=1&query=company[]Oraclepage1company[]Oracle

public class RemoveDuplicateFromLinkedList {

	static class Node {
		int val;
		Node next;

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(11, null);
		head.next = new Node(11, null);
		head.next.next = new Node(20, null);
		head.next.next.next = new Node(20, null);
		
		Node result = removeDuplcateNode(head);
		
		System.out.println(removeDuplcateNode(head));
	}

	public static Node removeDuplcateNode(Node head) {

		if (head == null) {
			return null;
		}

		Node curr = head;

		while (curr != null) {

			if (curr.val == curr.next.val) {
				Node nextNode = curr.next.next;
				curr.next = nextNode;
			} else {
				curr = curr.next;
			}
		}

		return head;

	}
	
	public void printLinkedList(Node result) {
		while(result != null) {
		  System.out.println(result.next);
		  result = result.next;
		}
	}

}
