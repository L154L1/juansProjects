// 26. Remove Duplicates from Sorted Array

//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// Note:
// In computer science, an in-place algorithm is an algorithm which transforms input using no auxiliary data structure. 
// However a small amount of extra storage space is allowed for auxiliary variables. The input is usually overwritten by the output as the algorithm executes. 
// In-place algorithm updates input sequence only through replacement or swapping of elements. 
// An algorithm which is not in-place is sometimes called not-in-place or out-of-place.


//Example 1:
//Given nums = [1,1,2],
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//It doesn't matter what you leave beyond the returned length.

//Example 2:
//Given nums = [0,0,1,1,1,2,2,3,3,4],
//Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
//It doesn't matter what values are set beyond the returned length.


// My score:
//Success
//Runtime: 1 ms, faster than 97.82% of Java online submissions for Remove Duplicates from Sorted Array.
//Memory Usage: 38.3 MB, less than 99.47% of Java online submissions for Remove Duplicates from Sorted Array.



package q26_Remove_Duplicates_from_Sorted_Array;

public class Solution {
	
	public int removeDuplicates(int[] nums) {
		
		if(nums.length == 0) return 0;
		
		int i = 0;
		for(int j=1; j<nums.length; j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}				
		return i+1;
				
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] test1 = {0,0,1,1,1,2,2,3,3,4};
		int[] test2 = {1,1,2};
		
		int[] test3 = {1};
		
		System.out.println(s.removeDuplicates(test1));		// 5
		System.out.println(s.removeDuplicates(test2));		// 2
		
		System.out.println(s.removeDuplicates(test3));		// 1

	}

}
