// polymorphism -  an object can be referenced by its own type, or its superclass or an interface it implements.

package q3;

interface CanHop {}

public class Frog implements CanHop {

	public static void main(String[] args) {
		Frog frog = new TurtleFrog();
		CanHop frog2 = new TurtleFrog();
		Object frog3 = new TurtleFrog();
		TurtleFrog frog4 = new TurtleFrog();
	}
}

class BrazillianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}
