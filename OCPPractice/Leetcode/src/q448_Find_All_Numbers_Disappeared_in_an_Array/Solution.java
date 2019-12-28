//448. Find All Numbers Disappeared in an Array

//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

//Find all the elements of [1, n] inclusive that do not appear in this array.

//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

//Example:
//Input:
//[4,3,2,7,8,2,3,1]
//Output:
//[5,6]

// My score:
//Success 
//Runtime: 23 ms, faster than 27.31% of Java online submissions for Find All Numbers Disappeared in an Array.
//Memory Usage: 47 MB, less than 94.34% of Java online submissions for Find All Numbers Disappeared in an Array.


package q448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.*;

public class Solution {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		
		List<Integer> list = new ArrayList<>();
		int n = nums.length;		
		if(n == 0) return list;
		
		Arrays.sort(nums);
				
		// Remove Duplicates from Sorted Array and return subarray nums[0] - nums[i]
		int i = 0;
		for(int j=1; j<n; j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		
		int smallest = nums[0];
		int m = 1;
		
		for(int k=1; k<=n; k++) {			
			if(k != smallest) list.add(k);
			else if(m <= i) {
				smallest = nums[m];
				m++;			
			}			
		}
				
		return list;
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] a = {4,3,2,7,8,2,3,1};	// output: [5, 6]
		
		int[] a2 = {1,1};				// output: [2]
		
		List<Integer> list = s.findDisappearedNumbers(a);
		
		System.out.println(list);

	}

}
