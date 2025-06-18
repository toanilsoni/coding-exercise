package list;

import java.util.ArrayList;
import java.util.List;

public class BasicList {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		// al.remove(0);
		al.set(0, 100);
		System.out.println(al.get(0));

	}
}
