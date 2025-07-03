/*https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#axzz7Q1I8VRMv
Time Complexity	O(n)
Space Complexity	O(1)
 */

package array;

public class ShortestWordDistance {

	public static void main(String[] args) {

		String[] array = { "hi", "good", "earth", "bye", "hi", "car", "truck" };
		String start = "hi";
		String end = "bye";

		shortestWordDistance(array, start, end);
	}
	
	public static void shortestWordDistance(String[] array, String start, String end) {

		int l = -1;
		int r = -1;
		int shortest = array.length; // initialize shortest to a value that's guaranteed to be larger than any possible valid distance

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(start)) {
				l = i;
			} else if (array[i].equals(end)) {
				r = i;
			}
		}

		shortest = Math.min(shortest, Math.abs(l - r));

		System.out.print("shortest: " + shortest);
	}

}
