package p125_array_binarySearch;

import java.util.Arrays;

public class P125 {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers, 2));	// 0
		System.out.println(Arrays.binarySearch(numbers, 4));	// 1
		System.out.println(Arrays.binarySearch(numbers, 1));	// -1
		System.out.println(Arrays.binarySearch(numbers, 3));	// -2
		System.out.println(Arrays.binarySearch(numbers, 9));	// -5
		
		// when array is not sorted, result is unpredictable - could happen to be right or wrong.
		int[] numbers2 = {3, 2, 1};
		System.out.println(Arrays.binarySearch(numbers2, 2));	// 1	happens to be right	
		System.out.println(Arrays.binarySearch(numbers2, 3));	// -4	incorrect

	}
}
