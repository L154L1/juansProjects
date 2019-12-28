package p138_sort_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P138 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers);	// [5, 81, 99]
		
		System.out.println(Collections.binarySearch(numbers, 81));		// 1
		System.out.println(Collections.binarySearch(numbers, 88));		// -3
	}
}
