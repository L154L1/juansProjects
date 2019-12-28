// Java console does not work in non-intelligent condition, (for example, in an IDE).

package p438_interact_with_users_new_way;

import java.io.*;

public class ConsoleSamplePrint {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Console console = System.console();
		if(console == null) {
			throw new RuntimeException("Console not available");
		} else {
			console.writer().println("Welcome to our zoo!");
			console.format("Our zoo has 391 animals and employs 25 people.");
			console.writer().println();
			console.printf("The zoo spans 128.91 acres");
		}

	}

}
