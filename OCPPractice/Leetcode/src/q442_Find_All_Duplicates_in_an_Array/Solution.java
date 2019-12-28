//442. Find All Duplicates in an Array
//Medium

//Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//Find all the elements that appear twice in this array.
//Could you do it without extra space and in O(n) runtime?

//Example:
//Input:
//[4,3,2,7,8,2,3,1]
//Output:
//[2,3]

// My score:
//Success
//Runtime: 23 ms, faster than 22.05% of Java online submissions for Find All Duplicates in an Array.
//Memory Usage: 48.7 MB, less than 36.11% of Java online submissions for Find All Duplicates in an Array.

package q442_Find_All_Duplicates_in_an_Array;

import java.util.*;

public class Solution {
	
	public List<Integer> findDuplicates(int[] nums) {				
		
		List<Integer> list = new ArrayList<>();
		
		if(nums.length == 0 || nums.length == 1) return list;
		
		Arrays.sort(nums);
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1] == nums[i]) list.add(nums[i]);			
			
		}
						
		return list;
						
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] a1 = {4,3,2,7,8,2,3,1};
		
		System.out.println(s.findDuplicates(a1));		// [2, 3]

	}

}
