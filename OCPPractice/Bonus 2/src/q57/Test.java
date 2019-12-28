// Q. 57  	Assuming that the file baboon.txt exists, and it is available for read/write access within the file system, what is the result of executing the following code? 

// Answer : B.	It does not modify any of the file date/time values.

// The BasicFileAttributeView.setTimes() method takes null arguments if the date/time value should not be modified, so the code does not modify the date/time values of the file

package q57;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("baboon.txt");
		BasicFileAttributeView view = Files.getFileAttributeView(path,BasicFileAttributeView.class);
		BasicFileAttributes data = view.readAttributes(); // x1
		view.setTimes(null,null,null); // x2

	}

}
