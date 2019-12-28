//Which code fragment, when inserted at line n1, enables the Birdie class to compile?
// A. static void fly (Consumer<Bird> bird) {
// 	bird :: fly ();
// }
// B. static void fly (Consumer<? extends Bird> bird) {
// 	bird.accept( ) fly ();
// }
// C. static void fly (Supplier<Bird> bird) {
// 	bird.get( ).fly();
// }
// D. static void fly (Supplier<? extends Bird> bird) {
// LOST

// Answer: C


package q7_Supplier;

import java.util.function.Supplier;

class Bird {
	public void fly() { System.out.print("Can fly");}
}

class Penguin extends Bird {
	public void fly() { System.out.print("Cannot fly");}
}

public class Birdie {

	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Penguin::new);

	}
	
	/* line n1 */
	static void fly(Supplier<Bird> bird) {
		bird.get().fly();
	}

}

// Can flyCannot fly
