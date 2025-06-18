package list;

public class MainArray {

	public static void main(String[] args) {
		Array arr = new Array(3);
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.removeAt(2);
		arr.indexOf(0);
		arr.print();
		System.out.println(arr.indexOf(2));
	}
}
