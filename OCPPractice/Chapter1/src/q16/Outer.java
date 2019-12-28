// This is a member inner class. It needs to be created using an instance of the outer class. 
// The syntax looks weird, but it creates an object of the outer class and then an object of the inner class from it.

package q16;

public class Outer {
	
	public class Inner{}

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		
		Inner in2 = new Outer().new Inner();

	}

}
