package list;

public class MainLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		/*ll.addLast(10);
		ll.addLast(20);*/
		
		ll.addFirst(20);
		ll.addFirst(10);
		ll.removeFirst();
		System.out.println(ll.indexOf(10));
		System.out.println(ll.contains(30));
	}
}
