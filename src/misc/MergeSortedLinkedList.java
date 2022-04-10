import java.util.Arrays;
import java.util.LinkedList;

public class MergeSortedLinkedList {

	static class ListNode {
		int val;
		ListNode next;

		public ListNode() {

		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}

	public static void main(String[] args) {

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);

		ListNode list2 = new ListNode(0);
		list2.next = new ListNode(2);
		list2.next.next = new ListNode(4);

		ListNode mergeList = mergeSortedLinkedList(list1, list2);

		printList(mergeList);

	}

	public static ListNode mergeSortedLinkedList(ListNode list1, ListNode list2) {

		ListNode result = new ListNode();

		ListNode p = result;

		while (list1 != null && list2 != null) {

			if (list1.val <= list2.val) {
				p.next = list1;
				list1 = list1.next;
			} else {
				p.next = list2;
				list2 = list2.next;
			}

			p = p.next;

		}

		if (list1 == null) {
			p.next = list2;
		}

		else if (list2 == null) {
			p.next = list1;
		}

		return result.next;

	}

	public static void printList(ListNode mergedList) {

		while (mergedList != null) {
			System.out.println(mergedList.val);
			mergedList = mergedList.next;

		}

	}

}
