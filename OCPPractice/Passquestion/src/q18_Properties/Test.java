//Given the content of Message.properties:
//welcome1="Good day!"

// What is the result?
// A. Good day!
// Test
// followed by an Exception stack trace
// B. Good day!
// followed by an Exception stack trace
// C. Good day!
// Test
// null
// D. A compilation error occurs at line n1.

// Answer: C

package q18_Properties;

import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("Message.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1"));			// "Good day!"
		System.out.println(prop.getProperty("welcome2", "Test"));	// Test
		System.out.println(prop.getProperty("welcome3"));			// null

	}

}



