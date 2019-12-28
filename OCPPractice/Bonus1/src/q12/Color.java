// Q12 : What is the result of this program?

// Shade is member inner class. It may be accessed from an instance of Color. 
// Since the constructor is called from a static method, L2 does not compile. 
// L1 does use the correct syntax for referencing a variable in the outer class.

package q12;

public class Color {

	private int hue = 10;
	public class Shade {
	public int hue = Color.this.hue;			// L1
	}
	public static void main(String[] args) {
	System.out.println(new Shade().hue);		// L2
	//System.out.println(new Color().new Shade().hue);	 // To correct L2
	}

}
