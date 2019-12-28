// toRealPath() - covert a relative path to an absolute path like toAbsolutePath(), 
// except that it also verifies the file referenced by the path actually exists, 
// and it throws IOException if the file cannot be located. So need to handle IOException. 
// toRealPath() implicitly calls normalize() on the resulting absolute path.
// If the path is already an absolute path, it will just verify if the file exists.

package p462_use_Path_object;

import java.nio.file.*;
import java.io.*;

public class Test8_toRealPath {

	public static void main(String[] args) {
		try {
			System.out.println(Paths.get("c:\\temp").toRealPath());
			//System.out.println(Paths.get("c:\\temp\\m").toRealPath());	// file doesn't exist, will throw IOException.
			
			System.out.println(Paths.get(".").toRealPath());	// C:\D\OCPPractice\Chapter9	- get current working directory
		} catch(IOException e) {
			System.out.println("Path does not exist!");
		}

	}

}
