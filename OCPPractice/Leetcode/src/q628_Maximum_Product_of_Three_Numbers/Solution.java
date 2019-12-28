//628. Maximum Product of Three Numbers

//Given an integer array, find three numbers whose product is maximum and output the maximum product.
//
//Example 1:
//Input: [1,2,3]
//Output: 6
 
//Example 2:
//Input: [1,2,3,4]
//Output: 24
 
//Note:

//The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
//Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.



//Approach 1: Using Sorting
//Algorithm
//Another solution could be to sort the given numsnums array(in ascending order) and find out the product of the last three numbers.
//But, we can note that this product will be maximum only if all the numbers in numsnums array are positive. But, in the given problem statement, negative elements could exist as well.
//Thus, it could also be possible that two negative numbers lying at the left extreme end could also contribute to lead to a larger product if the third number in the triplet being considered is the largest positive number in the numsnums array.
//Thus, either the product nums[0] \times nums[1] \times nums[n-1]nums[0]×nums[1]×nums[n−1] or nums[n-3] \times nums[n-2] \times nums[n-1]nums[n−3]×nums[n−2]×nums[n−1] will give the required result. Thus, we need to find the larger one from out of these values.


// Result:
//Success 
//Runtime: 15 ms, faster than 47.59% of Java online submissions for Maximum Product of Three Numbers.
//Memory Usage: 38.5 MB, less than 100.00% of Java online submissions for Maximum Product of Three Numbers.

package q628_Maximum_Product_of_Three_Numbers;

import java.util.Arrays;

public class Solution {
	
	public int maximumProduct(int[] nums) {
		
		int sum = 0;
		int n = nums.length;
		
		if(n <=3)
			for(int i=0; i<n; i++) sum += nums[i];
		
		Arrays.sort(nums);
		
		sum = Math.max(nums[n-3] * nums[n-2] * nums[n-1], nums[0] * nums[1] * nums[n-1]);
		
		return sum;
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] a1 = {-4,-3,-2,-1,60};
		
		System.out.println(s.maximumProduct(a1));

	}

}
