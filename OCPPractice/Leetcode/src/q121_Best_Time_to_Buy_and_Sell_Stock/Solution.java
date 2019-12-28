//121. Best Time to Buy and Sell Stock

//Say you have an array for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

//Note that you cannot sell a stock before you buy one.

//Example 1:
//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//             Not 7-1 = 6, as selling price needs to be larger than buying price.

//Example 2:
//Input: [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.

// My score:
//Success 
//Runtime: 1 ms, faster than 80.34% of Java online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.


package q121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
	
	public int maxProfit(int[] prices) {
		
		if(prices.length <= 1) return 0;
		
		int valley = prices[0], peek = prices[0], profit = 0, i = 0;
		
		while(i < prices.length - 1) {
			while(i < prices.length - 1 && prices[i] >= prices[i+1]) i++;
			valley = Math.min(valley, prices[i]);
			while(i < prices.length - 1 && prices[i] <= prices[i+1]) i++;
			peek = prices[i];
			profit = Math.max(profit, peek - valley);
		}
		
		return profit;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] a1 = {7,1,5,3,6,4};
		int[] a2 = {7,6,4,3,1};
		int[] a3 = {2,4,1};
		
		System.out.println(s.maxProfit(a2));

	}

}
