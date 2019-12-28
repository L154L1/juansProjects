// Q. 36  	What is the result of executing the following code? (Choose all that apply.)

// Answer -
// A.	The code runs without error but prints nothing.
// D.	A NullPointerException might be thrown.
// E.	An IOException might be thrown.

// Option A is correct because this code is missing a call to flush(). The String gets appended on the writer, but the output is never sent anywhere. 
// Options D and E are also correct. If there is no console available, a NullPointerException is thrown. 
// The append() method throws a checked IOException.


package q36;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		String line;
		Console c = System.console();
		Writer w = c.writer();
		if ((line = c.readLine()) != null)
		w.append(line);

	}

}
