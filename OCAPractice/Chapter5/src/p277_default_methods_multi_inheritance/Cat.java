// Having a class (including abstract class) that implements or inherits two duplicate default methods (same signature) forces the class to 
// implement a new version of the method, or the code will not compile.


package p277_default_methods_multi_inheritance;

interface Walk {
	default int getSpeed() {
		return 5;
	}
}

interface Run {
	default int getSpeed() {
		return 10;
	}
}


public class Cat implements Walk, Run {		// doesn't compile

	public static void main(String[] args) {

	}

}
