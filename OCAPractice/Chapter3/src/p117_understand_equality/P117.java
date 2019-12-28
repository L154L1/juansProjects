//- When it's reference type, == is only checking that object references refer to the same object.
//- Because JVM reuses String literals, when comparing string equality using ==, if two references refer to the same pooled string literal, they are equal.
//- String class implemented equals() method to compare the value inside the String reference (content). You should always use equals() to compare two String values.
//- StringBuilder didn't implement equals() method. If you use equals() on StringBuilder, it's the same way as using ==, only comparing references. 
//  Same is true for any other classes that didn't implement equals() method.

package p117_understand_equality;

public class P117 {

	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two);				// false
		System.out.println(one == three);			// true
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y);					// true
		
		String x2 = "Hello World";
		String y2 = " Hello World".trim();
		System.out.println(x2 == y2);				// false
		
		String x3 = new String("Hello World");
		String y3 = "Hello World";
		System.out.println(x3 == y3);				// false
		
		String x4 = "Hello World";
		String y4 = " Hello World".trim();
		System.out.println(x4.equals(y4));			// true
		
	}
}
