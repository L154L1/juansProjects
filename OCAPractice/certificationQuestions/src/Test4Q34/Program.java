// We haven't initialize ints[1], so it is null.
// Hence passing it to Arrays.sort() or Arrays.toString method throws NullPointerException.

package Test4Q34;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int[][] ints = new int[2][];
		
		Arrays.sort(ints[1]);
		
		System.out.print(Arrays.toString(ints[1]));

	}

}

//NullPointerException