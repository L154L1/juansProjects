// method overriding rules -
// 1. The method in the child class must have the same signature as the method in the parent class.
// 2. The method in the child class must be as least as accessible or more accessible than the method in the parent class.
// 3. The method in the child class may not throw a checked exception that is new or broader than those thrown in the parent class method.
// 4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.


package p250_override_method;

class InsufficientDataException extends Exception {}

class Reptile {
	boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}
	protected double getWeight() throws Exception {
		return 2;
	}
}

class Snake extends Reptile {
	protected boolean hasLegs() {
		return false;
	}
	protected double getWeith() throws InsufficientDataException {
		return 2;
	}
}
