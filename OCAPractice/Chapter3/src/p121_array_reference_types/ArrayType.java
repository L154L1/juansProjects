package p121_array_reference_types;

import java.util.*;

public class ArrayType {
	String names[] = new String[2];		// instantiate array of strings - set each string element to default value null.

	public static void main(String[] args) {
		String[] bugs = {"cricket", "beetle", "ladybug"};
		String[] alias = bugs;
		System.out.println(bugs.equals(alias));		// true		
													// We can call equals() on an array because array is an object. It compares reference equality for arrays.
		
		System.out.println(bugs.toString());		// [Ljava.lang.String;@15db9742	
		System.out.println(Arrays.toString(bugs));	// [cricket, beetle, ladybug]
		
		
		for (int i = 0; i < 2; i++) {
			System.out.print(new ArrayType().names[i] + " ");	// null null
		}
	}
}
