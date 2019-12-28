// Outer.this.x is the correct way to refer to x in the Outer class. 
// To use the variables in a local inner class, the variables need to be effectively final, which means that the code would still compile if final were added.

package q9;

public class Outer {
	 private int x = 24;	// Effectively final
	 public int getX() {
		 String message = "x is ";
		 class Inner {
			 private int x = Outer.this.x;	// Use a effectively final variable in the outer class.
			 public void printX() {
			 System.out.println(message + x);
			 }
		 }
		 Inner in = new Inner();
		 in.printX();
		 return x;
	 }
	 public static void main(String[] args) {
		 new Outer().getX();
	 } 

}


// x is 24
