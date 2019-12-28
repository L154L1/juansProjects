//35. Search Insert Position

//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

//You may assume no duplicates in the array.

//Example 1:
//Input: [1,3,5,6], 5
//Output: 2

//Example 2:
//Input: [1,3,5,6], 2
//Output: 1

//Example 3:
//Input: [1,3,5,6], 7
//Output: 4

//Example 4:
//Input: [1,3,5,6], 0
//Output: 0

// My score:
//Success
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//Memory Usage: 39 MB, less than 100.00% of Java online submissions for Search Insert Position.

package q35_Search_Insert_Position;

public class Solution {
	
	public int searchInsert(int[] nums, int target) {
		if(nums[nums.length-1] < target) return nums.length;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == target) return i;
        	if(i < nums.length-1 && nums[i] < target && nums[i+1] > target) return i+1;
        }
        return 0; // if(nums[0] > target)
    }

	public static void main(String[] args) {
		Solution s = new Solution();		
		int[] a = {1,3,5,6};
		
		System.out.println(s.searchInsert(a, 5));
		System.out.println(s.searchInsert(a, 2));
		System.out.println(s.searchInsert(a, 7));
		System.out.println(s.searchInsert(a, 0));

	}

}
