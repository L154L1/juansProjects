package p106_string_methods_1;

public class P106 {

	public static void main(String[] args) {
		String s = "animals";
		
		System.out.println(s.length());
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a', 4));
		System.out.println(s.indexOf("al"));
		System.out.println(s.indexOf("al", 5));		// -1
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(7));		// throws StringIndexOutOfBoundsException
		
	}
}
