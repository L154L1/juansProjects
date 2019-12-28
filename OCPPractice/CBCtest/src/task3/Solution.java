// A non=empty array A consisting of N integers is given. Integer X and Y are also given. 
// Look for the longest leading fragment of array A in which there is an equal number of occurrence of X and Y. More formally, looking for the largest index P, 
// such that 0<=P<N and the occurrence of X equals the number of occurrence of Y in the sequence of A[0], A[1]...,A[P].
// If no such value exists, return -1.

// For example:
// X=7, Y=42, A = {6, 42, 11, 7, 1, 42} 		-> P should be 4
// X=6, Y=13, A = {13, 13, 1, 6}				-> P should be -1
// X=100, Y=63, A = {100, 63, 1, 6, 2, 13}		-> P should be 5

// The code provided is still incorrect for some inputs. Despite the error(s), the code may produce a correct answer for the example test cases. The goal of the exercise is to find
// and fix the bug(s) in the implementation. You can modify at most two lines.

// Answer: there is a bug at 'else if' line which makes nY unable to increment when X and Y are equal. To correct, just need to remove 'else'.

package task3;

import java.util.*;

public class Solution {
	
	int solution(int X, int Y, int[] A) {
		int N = A.length;
		int result = -1;
		int nX = 0;
		int nY = 0;
		for(int i=0; i<N; i++) {
			if(A[i] == X)
				nX += 1;
			//else if(A[i] == Y)		// Bug: cannot cover Test4 which is X==Y
			if(A[i] == Y)
				nY += 1;
			if(nX == nY)
				result = i;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = {6, 42, 11, 7, 1, 42};
		int[] arr2 = {13, 13, 1, 6};
		int[] arr3 = {100, 63, 1, 6, 2, 13};
		int[] arr4 = {13, 13, 1, 6, 13, 14};
		
		Solution s = new Solution();
		// Test1:
		System.out.println(s.solution(7, 42, arr1));			// 4
		// Test2:
		System.out.println(s.solution(6, 13, arr2));			// -1
		// Test3:
		System.out.println(s.solution(100, 63, arr3));			// 5
		// Test4:
		System.out.println(s.solution(13, 13, arr4));			// 5

	}

}
