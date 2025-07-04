/* https://howtodoinjava.com/java/puzzles/fizzbuzz-solution-java/
Print numbers from 1 to N (in your case, N = 36), but:

If a number is divisible by 5, print "Fizz"

If a number is divisible by 7, print "Buzz"

If a number is divisible by both 5 and 7, print "FizzBuzz"

Otherwise, print the number itself
 */

package misc;
import java.awt.im.InputContext;
import java.io.InputStream;
import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {

		int number = 36;

		fizzBuzz(number);
		//fizzBuzzJava8(number);
	}

	public static void fizzBuzz(int number) {

		for (int i = 1; i < number; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Fizz");
			} else if (i % 7 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

	public static void fizzBuzzJava8(int number) {

		IntStream.rangeClosed(1, 100)
				.mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
				.forEach(System.out::println);
		;

	}

}
