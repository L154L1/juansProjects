// String class is immutable

package p105_String_immutable;

public class P105 {

	public static void main(String[] args) {
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);
	}
}
