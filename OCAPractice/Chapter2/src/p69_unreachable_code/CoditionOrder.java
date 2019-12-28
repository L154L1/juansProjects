// The order of branches is important in if-then-else statement.
package p69_unreachable_code;

public class CoditionOrder {

	public static void main(String[] args) {
		greet(12);
		greet2(12);		
	}
	
	static void greet(int hourOfDay){
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
	}
	
	static void greet2(int hourOfDay){
		if (hourOfDay < 15) {
			System.out.println("Good Morning");
		} else if (hourOfDay < 11) {		// unreachable branch
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
	}
}
