package q23;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, -1, 5);	// create
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
		
	}
}
