//Approach 2: Two Pointers - when elements to remove are rare

//Algorithm
//When we encounter nums[i] = val, we can swap the current element out with the last element and dispose the last one. This essentially reduces the array's size by 1.
//Note that the last element that was swapped in could be the value you want to remove itself. But don't worry, in the next iteration we will still check this element.

// Result:
//Success
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
//Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Remove Element.

package q27_Remove_Element;

public class Solution2 {
	
	public int removeElement(int[] nums, int val) {
		int i = 0;
		int n = nums.length;
		while(i < n) {
			if(nums[i] == val) {
				nums[i] = nums[n-1];
				n--;
			} else {
				i++;
			}
		}
		return n;
        
    }

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		int[] a1 = {3,2,2,3};
		int[] a2 = {0,1,2,2,3,0,4,2};
		
		System.out.println(s.removeElement(a1, 3));
		System.out.println(s.removeElement(a2, 2));


	}

}
