package q18;

class A {}

class B extends A {}

class C extends B {}


class D<C> {
	
	A a3 = new C();

	C c1 = new A();

}
