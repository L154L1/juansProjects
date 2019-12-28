package p62_compound_assignment_operator;

public class P62 {


	public static void main(String[] args) {
		long x = 10;
		int y = 5;
		y = y * x;
		
		y *= x;	// compound operator will first cast y to long, apply multiplication of two long values, and then cast the result to int.
	}
}
