package p62_compound_assignment_operator;

public class Inline_assignment {

	public static void main(String[] args) {
		long x = 5;
		long y = (x=3);
		System.out.println(x);	// 3
		System.out.println(y);	// 3
		
	}
}
