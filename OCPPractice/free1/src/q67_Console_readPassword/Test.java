// What is the result?
// A. A compilation error occurs at line n1.
// B. A compilation error occurs at line n2.
// C. The code reads the password without echoing characters on the console.
// D. A compilation error occurs because the IOException isn’t declared to be thrown or caught?

// Correct Answer: C

package q67_Console_readPassword;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		Console console = System.console();
		char[] pass = console.readPassword("Enter Password:"); // line n1
		String password = new String(pass);					// line n2

	}

}
