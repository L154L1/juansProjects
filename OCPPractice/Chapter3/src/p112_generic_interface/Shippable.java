// 3 ways to implement generic interface

package p112_generic_interface;

public interface Shippable<T> {
	void ship(T t);
}

// 1 - specify generic type
class ShippableRobot implements Shippable<Robot>{
	public void ship(Robot t) {}
}

// 2 - create a generic class
class ShippableAbstract<U> implements Shippable<U>{
	public void ship(U t) {}
}

// 3 - not using generic type. It generates a warning.
class ShippableNonGeneric implements Shippable{
	public void ship(Object t) {}
}



class Robot{}
