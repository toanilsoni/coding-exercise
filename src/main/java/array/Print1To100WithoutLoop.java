package array;

public class Print1To100WithoutLoop {
	static int i = 1;

	public static void main(String[] args) {

		if (i <= 100) {
			System.out.println(i++);
			main(null);
		}
	}

}
