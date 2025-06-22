//https://workat.tech/problem-solving/approach/bttbass/best-time-to-buy-and-sell-stock

package array;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {

		int[] prices = {7,1,5,3,6,4};

		System.out.println(bestTimeToBuyAndSellStocks(prices));
	}

	public static int bestTimeToBuyAndSellStocks(int[] prices) {
		int minPrice = Integer.MAX_VALUE; // will store lowest price seen
		int maxProfit = 0;				  // will store max profit found

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price;  // update minimum price
			} else {
				maxProfit = Math.max(maxProfit, price - minPrice);  // potential profit
			}
		}

		return maxProfit;
	}
}
