// complexity Solution 2:- https://medium.com/@timothyhuang514/dynamic-programming-coin-change-2-6b751d5088b5
package misc;

public class CoinChangeProblem {

	public static void main(String[] args) {

		int[] coins = { 1, 2 };
		// 2+2+1

		System.out.println(findCombination(coins, 5));
	}

	public static int findCombination(int[] coins, int amount) {

		int[] combinations = new int[amount + 1];
		combinations[0] = 1;

		for (int coin : coins) {
			for (int i = 1; i < combinations.length; i++) {
				if (i >= coin) {
					combinations[i] += combinations[i - coin];
				}
			}
		}

		return combinations[amount];
	}
}
