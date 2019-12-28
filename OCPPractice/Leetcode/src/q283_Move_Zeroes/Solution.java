//283. Move Zeroes

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

//Example:
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Note:
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.

// My score:
//Success 
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
//Memory Usage: 38.3 MB, less than 79.72% of Java online submissions for Move Zeroes.

package q283_Move_Zeroes;

public class Solution {
	
	public void moveZeroes(int[] nums) {
		
		int i = 0;
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] != 0) {
				nums[i] = nums[j];
				i++;
			}
		}
		
		for(int j = i; j < nums.length; j++) {
			nums[j] = 0;
		}
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] a1 = {0,1,0,3,12};
		
		s.moveZeroes(a1);
		
		for(int i : a1) System.out.print(i + " ");	// 1 3 12 0 0 

	}

}
