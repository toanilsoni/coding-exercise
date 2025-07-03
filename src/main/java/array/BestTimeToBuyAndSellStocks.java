/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock
Time Complexity: O(n)
 Space Complexity: O(1)
 */

package array;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {

		int[] prices = {7,1,5,3,6,4};

		System.out.println(bestTimeToBuyAndSellStocks(prices));
	}

	public static int bestTimeToBuyAndSellStocks(int[] prices) {
		int minPrice = Integer.MAX_VALUE; // The first actual price checked will replace it . Will store lowest price seen
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
