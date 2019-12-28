// 15. 3Sum

//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

//Note: The solution set must not contain duplicate triplets.

//Example:

//Given array nums = [-1, 0, 1, 2, -1, -4],

//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]

// Result:
//Success
//Runtime: 29 ms, faster than 87.58% of Java online submissions for 3Sum.
//Memory Usage: 47.3 MB, less than 88.34% of Java online submissions for 3Sum.

package q15_3Sum;

import java.util.*;

public class Solution {
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		
		/*The edge case*/
		if(nums.length < 3) return result;
		
		/*For the first, we have to sort the nums*/
		Arrays.sort(nums);
		
		 /*Here we declare 3 indexes. This is how it works. 
        -4 -2 -3 -1 0 0 0 2 3 10 21
         s  l                     r 
         
         s - start index, l - left index, r - right index */
        int start = 0, left, right;

        /*The target is that number we are looking for to be composed out of 2 numbers from our array.
        for example, if we have the startIndex at -4, we are looking for those two numbers in the given array
        which, summed up will be the oposite of -4, which is 4, cuz -4 + 4 = 0 (duh) */
        int target;

        /*The start goes from 0 to length-2 becuse look here
         -4 -2 -3 -1 0 0 0 2 3 10 21
                             s  l  r      */
        
        while(start < nums.length -2) {
        	target = nums[start] * -1;
        	left = start + 1;
        	right = nums.length - 1;
        
        
        /*Now, the start index is fixed and we move the left and right indexes to find those two number
        which summed up will be the oposite of nums[s]  */
		
        	while(left < right) {
        		/*The array is sorted, so if we move to the left the right index, the sum will decrese */
        		if(nums[left] + nums[right] > target)
        			right--;
        		/*Here is the oposite, it the sum of nums[l] and nums[r] is less that what we are looking for,
                then we move the left index, which means that the sum will increase due to the sorted array.
                the left index will jump to a bigger value */
        		else if(nums[left] + nums[right] < target)
        			left++;
        		/*If none of those are true, then it means that nums[l]+nums[r] = our desired value */
        		else {
        			/*Here we create the solution and add it to the list of lists which contains the result. */
        			List<Integer> triplet = Arrays.asList(nums[start], nums[left], nums[right]);
        			result.add(triplet);
        			
        			 /*Now, in order to generate different solutions, we have to jump over repetitive values in the array.  */
        			while(left < right && nums[left] == triplet.get(1)) left++;
        			while(left < right && nums[right] == triplet.get(2)) right--;
        			
        		}
        	}
        	
        	/*Now we do the same thing go thru start index to jump over repetitive values in the array.*/
        	int current = nums[start];
        	while(start < nums.length - 2 && nums[start] == current) start++;
        	
        }
        return result;
    }
	
	public static void main(String[] args) {
	
		int[] arr = {-1, 0, 1, 2, -1, -4};
		System.out.println(new Solution().threeSum(arr));
	}

}
