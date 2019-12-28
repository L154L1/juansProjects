// Q. 5  	What is the result of executing the following code? (Choose all that apply.)

// B.	The code prints what was entered by the user.
// D.	A NullPointerException might be thrown.
// E.	An IOException might be thrown.


// The append() and flush() method on console writer throw an IOException. Need to be handled or declared.

package q5;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		String line;
		Console c = System.console();
		Writer w = c.writer();
		if ((line = c.readLine()) != null)
		w.append(line);
		w.flush();

	}

}
