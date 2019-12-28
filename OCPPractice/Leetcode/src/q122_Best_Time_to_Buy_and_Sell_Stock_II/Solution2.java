//Approach 2: Simple One Pass
//Algorithm
//This solution follows the logic used in Approach 2 itself, but with only a slight variation. In this case, instead of looking for every peak following a valley, we can simply go on crawling over the slope and keep on adding the profit obtained from every consecutive transaction. In the end,we will be using the peaks and valleys effectively, but we need not track the costs corresponding to the peaks and valleys along with the maximum profit, but we can directly keep on adding the difference between the consecutive numbers of the array if the second number is larger than the first one, and at the total sum we obtain will be the maximum profit. This approach will simplify the solution. This can be made clearer by taking this example:

//[1, 7, 2, 3, 6, 7, 6, 7]
//The graph corresponding to this array is: (graph)

// Result:
//Success
//Runtime: 1 ms, faster than 92.27% of Java online submissions for Best Time to Buy and Sell Stock II.
//Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.


package q122_Best_Time_to_Buy_and_Sell_Stock_II;

public class Solution2 {
	
	public int maxProfit(int[] prices) {
		if(prices.length == 0) return 0;
		
		int maxProfit = 0;
		for(int i=1; i<prices.length; i++) {
			if(prices[i]>prices[i-1]) maxProfit += prices[i] - prices[i-1];
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		int[] a1 = {7,1,5,3,6,4};
		int[] a2 = {1,2,3,4,5};
		int[] a3 = {7,6,4,3,1};
		int[] a4 = {1, 7, 2, 3, 6, 7, 6, 7};
		
		System.out.println(s.maxProfit(a1));		//7
		System.out.println(s.maxProfit(a2));		//4
		System.out.println(s.maxProfit(a3));		//0
		System.out.println(s.maxProfit(a4));		//12

	}

}
