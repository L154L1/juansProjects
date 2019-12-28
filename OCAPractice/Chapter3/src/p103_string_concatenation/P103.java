package p103_string_concatenation;

public class P103 {

	public static void main(String[] args) {
		System.out.println(1 + 2);		// 3
		System.out.println("a" + "b" + 3);	// ab3
		System.out.println(1 + 2 + "c");	// 3c
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);	// 64
		
		String s = "1";
		s += "2";
		s += 3;
		System.out.println(s);		// 123
	}
}
