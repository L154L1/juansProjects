// If a method doesn't throw any checked method, the caller cannot catch any checked exception when calling it - unreachable code. 
// But the caller can declare any exceptions.

package p318_calling_methods_checked_exceptions;


public class Bunny2 {
	private static void eatCarrot() {}
	
	public void bad() {
		try{
			eatCarrot();
		}	catch (NoMoreCarrotsException e) {
			System.out.print("sad rabbit");
		}
	}
	
	public void good() throws NoMoreCarrotsException  {
		eatCarrot();
	}
}
