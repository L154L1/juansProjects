//Approach 2
//Algorithm

//Say the given array is:
//[7, 1, 5, 3, 6, 4]
//If we plot the numbers of the given array on a graph, we get: (graph)

//The points of interest are the peaks and valleys in the given graph. We need to find the largest peak following the smallest valley. We can maintain two variables - minprice and maxprofit corresponding to the smallest valley and maximum profit (maximum difference between selling price and minprice) obtained so far respectively.

// Result:
//Success
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.

package q121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution2 {
	
	public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		int[] a1 = {7,1,5,3,6,4};
		int[] a2 = {7,6,4,3,1};
		int[] a3 = {2,4,1};
		
		System.out.println(s.maxProfit(a3));

	}

}
