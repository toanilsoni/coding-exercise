package misc;

public class FibonacciSeries {

	public static void main(String args[]) {

		int index = 0;

		while (true) {
			System.out.println(fibonacciSeries(index));
			index++;
		}

	}

	static long fibonacciSeries(int i) {
		if (i == 0)
			return 0;
		if (i <= 2)
			return 1;

		long fibTerm = fibonacciSeries(i - 1) + fibonacciSeries(i - 2);
		return fibTerm;

	}

}
