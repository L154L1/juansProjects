package q7;		// B - [9]

import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		System.out.println(list);
	}
}
