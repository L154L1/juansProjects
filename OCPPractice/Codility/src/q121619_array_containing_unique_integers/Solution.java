// CBC interview questions task2.

// Write a function that, given an integer N(1 <= N <= 100), returns an array containing N unique integers that sum up to 0. 
// The function can return any such array.

// For example, given N = 4, the function could return [1,0,-3,2] or [-2,1,-4,5]. The answer [1,-1,1,3] would be incorrect because value 1 occurs twice. 
// For N = 3 one of the possible answers is [] (but there are many more correct answers)

package q121619_array_containing_unique_integers;

import java.util.Arrays;

public class Solution {
	
	public int[] solution(int N) {
		
		int[] arr = new int[N];
		int value = -N/2;
		if(N % 2 == 0) {			
			for(int i = 0; i < N; i++, value++) {
				if(value == 0) value++;
				arr[i] = value;
			}				
		} else if (N % 2 == 1) {
			for(int i = 0; i < N; i++, value++) 
				arr[i] = value;		
		}
		
		return arr;			
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = new Solution().solution(5);
		
		int[] arr2 = new Solution().solution(101);
		
		Arrays.stream(arr2).forEach(System.out::println);

		
	}
	

}
