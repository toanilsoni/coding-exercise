package list;

import java.util.Arrays;

public class TestNewArray {

	public static void main(String[] args) {
		NewArray array = new NewArray(3);
		
		array.insert(10);
		array.insert(20);
		array.insert(30);
		array.insert(40);
		array.print();
		System.out.println(array.indexOf(10));
	}

}
