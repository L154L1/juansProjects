// Java is a pass-by-value language among methods
// Assigning a new primitive or reference to a parameter doesn't change the caller. 
// Calling methods on a reference to an object does affect the caller.

package p189_passing_data;

public class P189 {

	public static void main(String[] args) {
		String name = "Webby";
		speak1(name);
		System.out.println(name);		// Webby
		
		StringBuilder name2 = new StringBuilder();
		speak2(name2);
		System.out.println(name2);		// Webby
	}
	
	public static void speak1(String name) {
		name = "Sparky";
	}
	
	public static void speak2(StringBuilder s) {
		s.append("Webby");
	}
}
