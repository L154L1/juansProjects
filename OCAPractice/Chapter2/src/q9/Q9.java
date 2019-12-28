package q9;

public class Q9 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; ){		
			i = i++;	// This makes a infinite loop. The update statement is not present in the initialization block. This assignment makes i always 0.
			System.out.println(i);		// 0 every time
			System.out.println("hello world");
		}
	}
}
