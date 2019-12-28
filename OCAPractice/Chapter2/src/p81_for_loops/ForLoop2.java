// Standard for loop can do fine-grain control compared to for-each loop.

package p81_for_loops;

public class ForLoop2 {

	public static void main(String[] args) {
		int[] values = new int[3];
		values[0] = 10;
		values[1] = new Integer(5);
		values[2] = 15;
		
		for(int i = 1; i < values.length; i++){
			System.out.print(values[i] - values[i-1] + ", ");
		}
	}
}

// -5, 10,