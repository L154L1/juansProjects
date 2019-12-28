// p27 A local inner class is a nested class defined within a method. 
// - They do not have a access specifier.
// - They cannot be declared static and cannot declare static fields and methods.
// - They have access to all fields and methods of the enclosing class.
// - They do not have access to local variables of a method unless those variables are final or effectively final.


package p28_local_inner_class;

public class Outer {
	
	private int length = 5;
	public void calculate() {
		final int width = 20;
		class Inner{
			public void multiply() {
				System.out.println(length * width);
			}
			
//			int i;						// compiles
//			static int j = 0;			// doen't compile
//			static final int k = 0;		// compiles
			
			
		}
		Inner inner = new Inner();
		inner.multiply();
				
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.calculate();

	}

}
