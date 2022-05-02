//https://howtodoinjava.com/java/puzzles/fizzbuzz-solution-java/ 
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
