// static methods are not to be inherited. You always need interface name to reference them unless you static import the static method.
// (Interface variables are static but they can be inherited. )

package p278_static_interface_methods;

//import static p278_static_interface_methods.Hop.*;

interface Hop {
	static int getJumpHeight() {
		return 8;
	}
}

public class Bunny implements Hop {
	public void printDetails() {
		System.out.println(getJumpHeight());	// To reference the static method in an interface, the name of the interface must be used.
	}
	
	public void printDetails2() {
		System.out.println(Hop.getJumpHeight());
	}

}

class Bunny2 {

	public void printDetails() {
		System.out.println(Hop.getJumpHeight());
	}

}
