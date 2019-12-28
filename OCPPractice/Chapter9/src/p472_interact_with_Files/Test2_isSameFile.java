// Files.isSameFile(Path, Path) - test uniqueness
// It first checks if the Path objects are equal in terms of equals(), and if so, it returns true without checking if either file exists.
// If the Path object equals() comparison returns false, then it locates each file and determines if they are the same, throwing an IOException if either file doesn't exist.
// isSameFile() does not compare the content of the file. Two files have identical content and attributes, but if they are in different locations, the method will return false.

package p472_interact_with_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class Test2_isSameFile {

	public static void main(String[] args) {
		try {
				System.out.println(Files.isSameFile(Paths.get("/ostrich/feathers.png"), Paths.get("/ostrich/feathers.png")));	// true
				System.out.println(Files.isSameFile(Paths.get("c:/temp/tree/../monkey"), Paths.get("c:/temp/monkey")));			// true
				System.out.println(Files.isSameFile(Paths.get("c:/temp/./tree"), Paths.get("c:/temp/tree")));					// true
				System.out.println(Files.isSameFile(Paths.get("c:/temp/Test.java"), Paths.get("c:/temp2/Test.java")));			// false
			
				
				//System.out.println(Files.isSameFile(Paths.get("c:/temp/tree/../monkey2"), Paths.get("c:/temp/monkey2")));		// throw IOException because the file doesn't exist, even they are the same path after normalization.
				//System.out.println(Files.isSameFile(Paths.get("c:/temp/./tree2"), Paths.get("c:/temp/tree2")));					// throw IOException because the file doesn't exist, even they are the same path after normalization.

		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}


//true
//true
//true
//false
