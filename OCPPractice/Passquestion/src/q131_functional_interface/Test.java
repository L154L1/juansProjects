// Which two interfaces can you use to create lambda expressions? (Choose two.)
// A. T
// B. R
// C. P
// D. S
// E. Q
// F. U

//Answer: C E


package q131_functional_interface;

@FunctionalInterface
interface P { public void method1();}

@FunctionalInterface
interface Q extends P { public void method1();}

@FunctionalInterface
interface R extends P { public void method2(); }

@FunctionalInterface
interface S { public default void method() {} }

@FunctionalInterface
interface T { public void method1(); public void method2(); }

@FunctionalInterface
interface U { public void method1(); public abstract void method2(); }



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
