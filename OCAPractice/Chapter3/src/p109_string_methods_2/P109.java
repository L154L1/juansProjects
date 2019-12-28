package p109_string_methods_2;

public class P109 {

	public static void main(String[] args) {
		String s = "animals";		
		System.out.println(s.toUpperCase());					// ANIMALS
		System.out.println("Abc123".toLowerCase());				// abc123
		
		System.out.println("abc".equals("ABC"));				// false
		System.out.println("ABC".equals("ABC"));				// true
		System.out.println("abc".equalsIgnoreCase("ABC"));		// true
		
		System.out.println("abc".startsWith("a"));				// true
		System.out.println("abc".startsWith("A"));				// false
		System.out.println("abc".endsWith("c"));				// true
		System.out.println("abc".endsWith("a"));				// false
		
		System.out.println("abc".contains("b"));				// true
		System.out.println("abc".contains("B"));				// false
		
		System.out.println("abcabc".replace('a', 'A'));			// AbcAbc
		System.out.println("abcabc".replace("a", "A"));			// AbcAbc
		
		System.out.println("abc".trim());						// abc
		System.out.println("\t  a b c\n".trim());				// a b c
		
		
		// method chaining
		String start = "AniMal  ";
		String trimmed = start.trim();
		String lowercase = trimmed.toLowerCase();
		String result = lowercase.replace('a', 'A');
		System.out.println(result);								// AnimAl
		
		String result2 = "AniMal  ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result2);							// AnimAl
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace("C", "3");
		System.out.println("a=" + a);							// a=abc
		System.out.println("b=" + b);							// b=A23
	}
}
