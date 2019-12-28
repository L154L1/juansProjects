// Having a class (including abstract class) that implements or inherits two duplicate default methods (same signature) forces the class to 
// implement a new version of the method, or the code will not compile.

package p277_default_methods_multi_inheritance;

interface Walk2 {
	default int getSpeed() {
		return 5;
	}
}

interface Run2 {
	default int getSpeed() {
		return 10;
	}
}

interface Test extends Walk2, Run2{
	default int getSpeed() {return 0;};
}

abstract class Abs implements Walk2, Run2{
	public abstract int getSpeed();
}

public class Cat2 implements Walk2, Run2 {
	
	public int getSpeed() {
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(new Cat2().getSpeed());

	}

}
