// Q. 41  	What is the result of the following class?

// Due to type erasure, both methods have the same signature. Since two methods cannot have the same name and parameter list, the code does not compile.

package q41;

public class C<A> {

	A a;
	public void m(A a) {
	System.out.println("a");
	}
	public void m(Object o) {
	System.out.println("obj");
	}
	public static void main(String[] args) {
	C<String> c = new C<>();
	c.m("s");
	}

}
