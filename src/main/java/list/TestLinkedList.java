package list;

public class TestLinkedList {

	public static void main(String[] args) {
		NewLinkedList ll = new NewLinkedList();
		/*ll.addFirst(10);
		ll.addFirst(20);*/
		
		ll.addLast(10);
		ll.addLast(20);
		System.out.println(ll.indexOf(20));
		System.out.println(ll.contains(30));
		ll.removeFirst();
	}

}
