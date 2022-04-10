//https://workat.tech/problem-solving/approach/bttbass/best-time-to-buy-and-sell-stock

package array;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {

		int[] price = { 100, 180, 260, 310, 40, 535, 695 };

		System.out.println(bestTimeToBuyAndSellStocks(price, price.length));
	}

	public static int bestTimeToBuyAndSellStocks(int[] price, int size) {

		int profit = 0;
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {
				profit = Math.max(profit, price[j] - price[i]);

			}
		}
		return profit;

	}
}
