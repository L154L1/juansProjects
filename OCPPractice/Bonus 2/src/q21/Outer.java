// Q. 21  	Which of the following are true statements about the following code? (Choose all that apply.)

// Answer : line c1 and c2 don't complile.

// A local inner class is not allowed to have static methods. It also goes out of scope like regular local variables. Inner is scoped to be inside the for loop. 
// It is legal to declare an inner class inside a loop as long as it is referenced only inside that loop.

package q21;

public class Outer {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			class Inner {
				public static void print() {	// c1
				System.out.println("Roar!");
			}
		 }
	 }
	new Inner().print();						// c2
  } 

}


