// Q. 33  	What is the result of the following code?

// Both objects are BabyRhino objects. While the subclass does have a walk instance variable, it would be used only if referenced from the subclass. 
// Since the walk() method is in the superclass, the superclass instance variable is still used.

package q33;

public class FourLegged {
	
	String walk = "walk,";
	public void walk() {
	System.out.print(walk);
	}
	static class BabyRhino extends FourLegged {
	String walk = "toddle,";
	}

	public static void main(String[] args) {
		FourLegged f = new BabyRhino();
		BabyRhino b = new BabyRhino();
		f.walk();
		b.walk();

	}

}


// walk,walk,