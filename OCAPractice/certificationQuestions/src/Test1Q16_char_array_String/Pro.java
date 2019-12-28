package Test1Q16_char_array_String;

public class Pro {

	public static void main(String[] args) {
		char c[] = new char[]{'a','b','c'};
		String cd = "abcdef".substring(4);
		String s1 = new String(c);		// There is a constructor that takes a char array to construct String.
		s1 += cd;
		System.out.print(s1);	//abcef
	}
}
