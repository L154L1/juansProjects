//Write a function:

//class Solution { public int solution(int[] A); }
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//Given A = [1, 2, 3], the function should return 4.
//Given A = [-1, -3], the function should return 1.

//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [-1,000,000..1,000,000].

package Codility;

import java.util.*;

public class Solution {
	
	public static int solution(int[] A) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i< A.length; i++)
			list.add(A[i]);
		Arrays.sort(A);		
		for(int i=0; i< A.length; i++) {
			if(A[i]>=0 && !list.contains(A[i]+1)) return A[i]+1;
		}
				
		return 1;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		
		// Test 1:
		int[] a = {1, 3, 6, 4, 1, 2};
		System.out.println(s.solution(a));		// 5
		
		// Test 2:
		int[] a2 = {-1, -3, -6, -4, -1, -2};
		System.out.println(s.solution(a2));		// 1

	}

}
