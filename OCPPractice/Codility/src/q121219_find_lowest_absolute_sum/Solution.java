//Given array of integers, find the lowest absolute sum of elements.

//For a given array A of N integers and a sequence S of N integers from the set {−1, 1}, we define val(A, S) as follows:
//
//val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
//
//(Assume that the sum of zero elements equals zero.)
//
//For a given array A, we are looking for such a sequence S that minimizes val(A,S).
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, computes the minimum value of val(A,S) from all possible values of val(A,S) for all possible sequences S of N integers from the set {−1, 1}.
//
//For example, given array:
//
//  A[0] =  1
//  A[1] =  5
//  A[2] =  2
//  A[3] = -2
//your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..20,000];
//each element of array A is an integer within the range [−100..100].

package q121219_find_lowest_absolute_sum;

import java.util.*;

public class Solution {
	
	public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < A.length; i++) {
        	if(map.containsKey(Math.abs(A[i]))) {
        		A[map.get(Math.abs(A[i]))] = 0;
        		A[i] = 0;
        		map.remove(Math.abs(A[i]));
        	} else 
        		map.put(Math.abs(A[i]), i);
        }
        
        for(int i = 0; i < A.length; i++)
        	A[i] = Math.abs(A[i]);
        
        Arrays.sort(A);
        
        int s = 0;
        for(int i = 0; i < A.length; i++) 
        	s += A[i];
        
        int p = 0;
        for(int i = 0; i < A.length; i++) {
        	if(p <= s/2)
        		s += A[i];
        	else break;
        }
        
        return s/2 - p;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] A = {1,5,2,-2};
		
		System.out.println(s.solution(A));

	}

}
