package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		 LinkedList<String> list=new LinkedList<String>();

	     //Adding elements to the Linked list
	     list.add("3");
	     list.add("4");
	     list.add("2");
	     list.add("10");

	  /*   //Adding an element to the first position
	     list.addFirst("40");

	     //Adding an element to the last position
	     list.addLast("Rick");

	     //Adding an element to the 3rd position
	     list.add(2, "Glenn");*/

	     //Iterating LinkedList
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
	   } 

}
