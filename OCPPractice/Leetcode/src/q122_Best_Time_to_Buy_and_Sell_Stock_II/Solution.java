//122. Best Time to Buy and Sell Stock II

//Say you have an array for which the ith element is the price of a given stock on day i.

//Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

//Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

//Example 1:
//Input: [7,1,5,3,6,4]
//Output: 7
//Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

//Example 2:
//Input: [1,2,3,4,5]
//Output: 4
//Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
//             engaging multiple transactions at the same time. You must sell before buying again.
//Example 3:
//
//Input: [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.

//Approach 1: Peak Valley Approach
//Algorithm
//Say the given array is:
//[7, 1, 5, 3, 6, 4].
//If we plot the numbers of the given array on a graph, we get:(graph)

//	If we analyze the graph, we notice that the points of interest are the consecutive valleys and peaks.
//	Mathematically speaking: TotalProfit=∑ 
//	i	​	
//	 (height(peak 
//	i	​	
//	 )−height(valley 
//	i	​	
//	 ))

//	The key point is we need to consider every peak immediately following a valley to maximize the profit. In case we skip one of the peaks (trying to obtain more profit), we will end up losing the profit over one of the transactions leading to an overall lesser profit.

// Result:
// Success
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.
//Memory Usage: 37 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.

package q122_Best_Time_to_Buy_and_Sell_Stock_II;

public class Solution {
	
	public int maxProfit(int[] prices) {
		
		if(prices.length == 0) return 0;
		
		int peak = prices[0];
		int valley = prices[0];
		int maxProfit = 0;
		int i = 0;
		
		while(i<prices.length-1) {
			while(i<prices.length-1 && prices[i] >= prices[i+1]) i++;
			valley = prices[i];
			while(i<prices.length-1 && prices[i] <= prices[i+1]) i++;
			peak = prices[i];
			maxProfit += peak - valley;
			
		}
		
		return maxProfit;
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] a1 = {7,1,5,3,6,4};
		int[] a2 = {1,2,3,4,5};
		int[] a3 = {7,6,4,3,1};
		
		System.out.println(s.maxProfit(a1));		//7
		System.out.println(s.maxProfit(a2));		//4
		System.out.println(s.maxProfit(a3));		//0

	}

}
