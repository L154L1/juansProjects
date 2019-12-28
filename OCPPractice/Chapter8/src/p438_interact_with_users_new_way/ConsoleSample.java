// Java console does not work in non-intelligent condition, (for example, in an IDE).

// Console class is a singleton. It is created by calling System.console() method.

// console.readLine() returns a String. console.read() doesn't exist.

package p438_interact_with_users_new_way;

import java.io.Console;

public class ConsoleSample {

	public static void main(String[] args) {
		Console console = System.console();
		if(console != null) {
			String userInput = console.readLine();
			console.writer().println("You entered the following:" + userInput);
		} else throw new RuntimeException("Console not available");

	}

}
