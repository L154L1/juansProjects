package q6;

public class Q6 {
	
	public static void main(String[] args) {
		int x = 4;
		long y = x * 4 - x++;
		if(y<10) System.out.println("Too low");
		else System.out.println("Just right");
		else System.out.println("Too high");		// compile error on this line, not the previous line
	}
}
