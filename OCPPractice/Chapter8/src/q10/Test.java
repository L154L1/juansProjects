// Q. 10  	The following method is designed to delete a directory tree recursively. Which of the following properties reflect the method definition? (Choose all that apply.)

// Answer :
// C.	It can delete a single file.
// F.	It compiles but may throw an exception at runtime.

// If the File doesn't exist, it throws NullPointerException.

package q10;

import java.io.*;
public class Test {

	public static void main(String[] args) {
		deleteTree(new File("C:\\temp2"));

	}
	
	public static void deleteTree(File file) {
		if(!file.isFile())
			for(File entry: file.listFiles())
				deleteTree(entry);
		else file.delete();
	}

}
