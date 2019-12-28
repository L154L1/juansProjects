// Q. 8  	What is true about the following code snippet?

// There is no read() method in the Console class; therefore the code does not compile. 
// If the method were changed to readLine(), it would compile and prints what the user entered if Console is supported.

package q8;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		String line;
		Console c = System.console();
		Writer w = c.writer();
		if ((line = c.read()) != null)
		w.append(line);
		w.flush();

	}

}
