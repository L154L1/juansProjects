// When a method throws a checked exception, the caller method must declare or catch it.

package p318_calling_methods_checked_exceptions;

class NoMoreCarrotsException extends Exception {}	// define a checked exception

public class Bunny {
	
	private static void eatCarrot() throws NoMoreCarrotsException {}
	
	public static void test1() {
		eatCarrot();
	}
	
	public static void test2() throws NoMoreCarrotsException {
		eatCarrot();
	}
	
	public static void test3() {
		try{
			eatCarrot();
		}	catch (NoMoreCarrotsException e) {
			System.out.print("sad rabbit");
		}		
	}
}
