// What is the result?

// Answer : B. Bar Hello Baz Hello

package q90_override_method;

class Foo {
	public void methodB(String s) { System.out.println("Foo " + s); }
}

class Bar extends Foo {
	public void methodB(String s) { System.out.println("Bar " + s); }
}

class Baz extends Bar {
	public void methodB(String s) { System.out.println("Baz " + s); }
}

class Daze extends Baz {
	private Bar bb = new Bar();
	public void methodB(String s) { 
		bb.methodB(s);
		super.methodB(s);
	}
}

public class TestClass {
	public static void main(String[] args) {
		Baz d = new Daze();
		d.methodB("Hello");

	}

}

//Bar Hello
//Baz Hello
