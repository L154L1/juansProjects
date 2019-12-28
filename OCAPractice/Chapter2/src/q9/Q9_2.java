package q9;

public class Q9_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; ){		
			i++;	// The update statement is not present in the initialization block. i++; here makes i increment.
			System.out.println(i);		
			System.out.println("hello world");
		}

	}

}
