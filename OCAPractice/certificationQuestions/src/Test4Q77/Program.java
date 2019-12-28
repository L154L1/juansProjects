package Test4Q77;

interface Inter{}
abstract class A implements Inter{}
class B extends A{}
class Program {

	public static void main(String[] args) {
		Inter in = new B();
		A a = new B();
		
		System.out.print((in instanceof Inter) + " " + (a instanceof Inter));	//true true

	}

}
