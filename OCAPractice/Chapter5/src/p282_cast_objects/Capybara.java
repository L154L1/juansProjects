// 3. The compiler will not allow casts to unrelated types.
// 4. Even when the code compiles without issue, an exception will be thrown at runtime if the object being cast is not actually an instance of that class.

package p282_cast_objects;

class Rodent {
	
}

public class Capybara extends Rodent {

	public static void main(String[] args) {
		Rodent rodent = new Rodent();
		Capybara capybara = (Capybara)rodent;	// compiles without issue but throws ClassCastException at runtime.
												// Because new Rodent() object is not an instance of Capybara, the cast is not allowed.
		
		// to prevent ClassCastException
		if(rodent instanceof Capybara){
			Capybara capybara2 = (Capybara)rodent;
		}
		
		System.out.println(rodent instanceof Capybara);
	}
}
