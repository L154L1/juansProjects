// What is the result?
// A. Hi Interface-2
// B. A compilation error occurs.
// C. Hi Interface-1
// D. Hi MyClass

// Correct Answer: D

package q79_default_method;

interface Interface1{
	public default void sayHi() {
		System.out.println("Hi Interface-1");
	}

}

interface Interface2{
	public default void sayHi() {
		System.out.println("Hi Interface-2");
	}

}

public class MyClass implements Interface1, Interface2 {	

	public static void main(String[] args) {
		Interface1 obj = new MyClass();
		obj.sayHi();		// Hi MyClass

	}
	
	public void sayHi() {						// must override duplicate default methods.
		System.out.println("Hi MyClass");
	}

}
