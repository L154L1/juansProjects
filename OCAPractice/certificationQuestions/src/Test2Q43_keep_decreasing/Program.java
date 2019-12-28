// At line of while loop, while loop keeps decreasing the value of the variable y until the max int 2147483646.

package Test2Q43_keep_decreasing;

public class Program {

	public static void main(String[] args) {
		int y = 0;
		while(y--<10){continue;}
		String message = y>10?"Greater than":"Less than";
		System.out.println(message + " 10");
		
		System.out.println(y);

	}
}

// Greater than 10

// 2147483646