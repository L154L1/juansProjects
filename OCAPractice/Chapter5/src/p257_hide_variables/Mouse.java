// Java doesn't allow variables to be overridden but instead hidden, 
// which means if you are referencing the variable from within the parent class, the variable defined in the parent class is used; 
// if you are referencing the variable from within a child class, the variable defined in the child class is used.
// These rules are the same regardless of instance variable or static variable.

package p257_hide_variables;

class Rodent {
	protected int tailLength = 4;
	public void getRodentDetails () {
		System.out.println("[parentTail=" + tailLength + "]");
	}
}

public class Mouse extends Rodent {
	protected int tailLength = 8;
	public void getMouseDetails () {
		System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
	}
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
	}
}
