// One of uses of polymorphism is : define an method that takes an instance of an interface or superclass as a parameter, 
// so any class that implements the interface can be passed as parameter to the method.

package p285_polymorphic_parameters;

class Reptile {
	public String getName() {
		return "Reptile";
	}
}

class Alligator extends Reptile {
	public String getName() {
		return "Alligator";
	}
}

class Crocodile extends Reptile {
	public String getName() {
		return "Crocodile";
	}
}

public class ZooWorker {
	public static void feed(Reptile reptile) {
		System.out.println("Feeding: " + reptile.getName());
	}
	public static void main(String[] args) {
		feed(new Reptile());
		feed(new Alligator());
		feed(new Crocodile());
	}
}
