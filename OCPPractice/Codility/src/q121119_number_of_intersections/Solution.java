// Question: NumberOfDiscIntersections
// Compute the number of intersections in a sequence of discs.
// Difficulty: medium

//We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].

//We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).

//The figure below shows discs drawn for N = 6 and A as follows:
//  A[0] = 1
//  A[1] = 5
//  A[2] = 2
//  A[3] = 1
//  A[4] = 4
//  A[5] = 0
 
//		  There are eleven (unordered) pairs of discs that intersect, namely:
//			  discs 1 and 4 intersect, and both intersect with all the other discs;
//			  disc 2 also intersects with discs 0 and 3.

//			  Write a function:

//			  class Solution { public int solution(int[] A); }

//			  that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

//			  Given array A shown above, the function should return 11, as explained above.

//			  Write an efficient algorithm for the following assumptions:
//			  N is an integer within the range [0..100,000];
//			  each element of array A is an integer within the range [0..2,147,483,647]. (Java int range -2,147,483,648 to 2,147,483,647 (-2 to power 31 to 2 to power 31 – 1).


// My algorithm: compare boundary value of every two elements in the given array.
// A[i]  left and right boundary values are (i-A[i], i+A[i])
// A[i]  left and right boundary values are (i-A[j], i+A[j])
// if A[i] right boundary value is greater than A[j] left boundary value, it means they have overlap or intersect in terms mentioned above.
// Need to handle overflow because A[i] could be int max and A[i]+max will overflow.

// My score:
//Task Score
//62%
//Correctness
//100%
//Performance
//25%
// time complexity: O(N**2)


package q121119_number_of_intersections;

public class Solution {
	
	public int solution(int[] A) {
		
		if(A.length == 1) return 0;
		int count = 0;
        for(int i = 0; i < A.length; i++) {
        	for(int j = i+1; j < A.length; j++) {
        		int R_i = (A[i] <= Integer.MAX_VALUE - i) ? i + A[i] : Integer.MAX_VALUE;
        		int L_j = j - A[j];
        		if(L_j <= R_i) count++;
        	}
        }
        
        if(count <= 10000000)
        	return count;
        else return -1;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = {1,5,2,1,4,0};
		
		System.out.println(s.solution(A));		// 11

	}

}
