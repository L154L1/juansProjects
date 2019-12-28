package q22;

import java.util.Arrays;

public class Q22 {

	public static void main(String[] args) {
		int[] random = { 6, -4, 12, 0, -10};
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);		// (unpredicted result)
		
		Arrays.sort(random);
		int y2 = Arrays.binarySearch(random, x);
		System.out.println(y2);		// 4
		
		//int y3 = Arrays.binarySearch(Arrays.sort(random), x);	// does not compile because Arrays.sort() method returns void instead of an array. 
	}
}
