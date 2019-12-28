// StringBuilder has these four methods working exactly the same as in the String class.
// substring() in StringBuilder returns a string.

package p114_StringBuilder_methods_1;

public class P114 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);		// anim 7 s
	}
}
