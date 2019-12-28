package q3;

public class CompareValues2 {

	public static void main(String[] args) {
		int x = 0;
		while(x++ < 10);
		String message = x > 10 ? "Greater than" : "not greater than";
		System.out.println(message+","+x);	// Greater than,11
	}
}
