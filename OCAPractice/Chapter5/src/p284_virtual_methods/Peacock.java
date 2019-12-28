// In Java, all non-final, non-static, non-private methods are considered virtual methods, since any of them can be overridden at runtime.
// What makes a virtual method special in Java is you call a method on a object that overrides a method, 
// you get the overriden method, even if the call to the method is on a prarent reference or within the parent class.

package p284_virtual_methods;

class Bird {
	public String getName() {
		return "Unknown";
	}
	public void displayInformation() {
		System.out.println("The bird name is: " + getName());
	}
}

public class Peacock extends Bird {
	public String getName() {
		return "Peacock";
	}
	
	public static void main(String args[]) {
		Bird bird = new Peacock();
		bird.displayInformation();		// The bird name is: Peacock

	}
}
