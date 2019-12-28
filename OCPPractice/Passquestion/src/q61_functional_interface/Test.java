// Which statement is true?

// Answer: A. Moveable can be used as below: Moveable<Integer> animal = n -> System.out.println("Running" + n);animal.run(100);animal.walk(20);

package q61_functional_interface;

interface Moveable<Integer>{
	public default void walk(Integer distance) { System.out.println("Walking");}
	public void run(Integer distance);
}

public class Test {

	public static void main(String[] args) {
		Moveable<Integer> animal = n -> System.out.println("Running" + n);
		animal.run(100);
		animal.walk(20);
		

	}

}
