package p123_bounds_practice_all;

import java.util.*;

class A {}
class B extends A {}
class C extends B {}

public class Test {
	
	static void listTest() {
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		List<? extends B> list4 = new ArrayList<A>();	// does not compile
		List<? super B> list5 = new ArrayList<A>();
		List<?> list6 = new ArrayList<? extends A>();	// does not compile - you can only instantiate an actual type
	}
	
	
	// generic methods with bounds
	<T> T method1(List<? extends T> list) {
		return list.get(0);
	}
	
	<T> <? extends T> method2(List<? extends T> list) {		// return type must be an actual type
		return list.get(0);
	}
	
	<B extends A> B method3(List<B> list) {
		return new B();		// B is used as type parameter. It no longer refers to class B so you cannot instantiate it.
	}
	
	void method4(List<? super B> list) {}
	
	// <X> void method5(List<X super B> list) {}	// X is a specific type. List<X super B> should use ? wildcard

}
