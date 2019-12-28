// A non empty array A consisting of N integers is given. Integer X and Y are also given. 
// Look for the longest leading fragment of array A in which there is an equal number of occurrence of X and Y. More formally, looking for the largest index P, 
// such that 0<=P<N and the occurrence of X equals the number of occurrence of Y in the sequence of A[0], A[1]...,A[P].
// If no such value exists, return -1.

// For example:
// X=7, Y=42, A = {6, 42, 11, 7, 1, 42} 		-> P should be 4
// X=6, Y=13, A = {13, 13, 1, 6}				-> P should be -1
// X=100, Y=63, A = {100, 63, 1, 6, 2, 13}		-> P should be 5

package q122019_equal_occurrence;

public class Solution {
	
	int solution(int X, int Y, int[] A) {
		
		int nX = 0, nY = 0, idx = -1;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] == X) nX++;
			if(A[i] == Y) nY++;
			if(nX == nY) idx = i;
		}
		
		return idx;
		
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		
//		int X=7, Y=42;
//		int[] A = {6, 42, 11, 7, 1, 42};		// 4
		
//		int X=6, Y=13; 
//		int[] A = {13, 13, 1, 6};				// -1
		
//		int X=100, Y=63; 
//		int[] A = {100, 63, 1, 6, 2, 13};		// 5
		
		int X=13, Y=13; 
		int[] A = {13, 13, 1, 6, 13, 14};		// 5
		
		System.out.println(s.solution(X, Y, A));

	}

}
