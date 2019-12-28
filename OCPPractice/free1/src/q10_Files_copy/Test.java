// Passquestion q23

// What is the result?
// A. A file with the name log.txt is created in the /data directory and the content of the /data/december/log.txt file is copied to it.
// B. The program executes successfully and does NOT change the file system.
// C. A FileNotFoundException is thrown at run time.
// D. A FileAlreadyExistsException is thrown at run time.

// Correct Answer: D

package q10_Files_copy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get ("C:/temp/data/december/goat.txt");
		Path destination = Paths.get("C:/temp/data");
		Files.copy (source, destination);	// throws FileAlreadyExistsException

	}

}

