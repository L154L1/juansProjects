// count all distinct elements in a given array 

package Codility2;

import java.util.*;

public class Solution {
	
// This idea is to traverse the given array from left to right and keep track of visited elements in a hash set , as a set consists of only unique elements.
	 public int solution(int[] A) {
		 HashSet<Integer> hs = new HashSet<>();
		 
		 for(int i = 0; i < A.length; i++)
			 hs.add(A[i]);
		 
		 return hs.size();
	    }

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 1};
		System.out.println(new Solution().solution(a));
		System.out.println(new Solution().solution2(a));

	}
	
	
// We can Use Sorting to solve the problem in O(nLogn) time. The idea is simple, first sort the array so that all occurrences of every element become consecutive. 
// Once the occurrences become consecutive, we can traverse the sorted array and count distinct elements in O(n) time. 
	public int solution2(int[] A) {
		Arrays.sort(A);
		int res = 0;
		for(int i=0; i<A.length; i++) {
			while(i<A.length-1 && A[i] == A[i+1]) i++;
			res++;
		}
		
		return res;
			
	}

}
