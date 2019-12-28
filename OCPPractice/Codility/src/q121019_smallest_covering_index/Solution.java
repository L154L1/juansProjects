//1. PrefixSet
//Given a table A of N integers from 0 to N-1 calculate the smallest such index P, that that {A[0],...,A[N-1]} = {A[0],...,A[P]}.

//A non-empty array A consisting of N integers is given. The first covering prefix of array A is the smallest integer P such that 0≤P<N and such that every value that occurs in array A also occurs in sequence A[0], A[1], ..., A[P].

//For example, the first covering prefix of the following 5−element array A:
//  A[0] = 2
//  A[1] = 2
//  A[2] = 1
//  A[3] = 0
//  A[4] = 1
//is 3, because sequence [ A[0], A[1], A[2], A[3] ] equal to [2, 2, 1, 0], contains all values that occur in array A.

//Write a function
//class Solution { public int solution(int[] A); }
//that, given a non-empty array A consisting of N integers, returns the first covering prefix of A.

//For example, given array A such that
//  A[0] = 2
//  A[1] = 2
//  A[2] = 1
//  A[3] = 0
//  A[4] = 1
//the function should return 3, as explained above.

//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..1,000,000];
//each element of array A is an integer within the range [0..N−1].

// My score:
//Task Score
//100%
//Correctness
//100%
//Performance
//100%
//Detected time complexity: O(N) or O(N*log(N))

package q121019_smallest_covering_index;

import java.util.*;

public class Solution {
	
	public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        int index = 0;
        for(int i = 0; i < A.length; i++) {
        	if(!set.contains(A[i])) index = i;
        	set.add(A[i]);
        }
        return index;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = {2,2,1,0,1};
		int[] A2 = {2,2,2,2,2};
		int[] A3 = {1,2,3,4,5};
		
		System.out.println(s.solution(A));
		System.out.println(s.solution(A2));
		System.out.println(s.solution(A3));

	}

}
