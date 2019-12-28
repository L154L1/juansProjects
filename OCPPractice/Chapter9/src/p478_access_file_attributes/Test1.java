// Files.isRegularFile(Path)
// Files.isDirectory(Path)
// Files.isSymbolicLink(Path)

// They don't throw IOException if the path does not exist. They just return false.

// If a symbolic link points to a real file or directory, Java will perform a check on the target of the symbolic link. 
// So it's possible for isRegularFile() or isDirectory() to return true for a symbolic link, as long as the link resolves to a regular file.

package p478_access_file_attributes;

import java.nio.file.*;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(Files.isDirectory(Paths.get("/canine/coyote/fur.jpg")));		// false  (the path objec referenced does not exist)
		System.out.println(Files.isDirectory(Paths.get("c:/temp/field")));			// true
		System.out.println(Files.isRegularFile(Paths.get("c:/temp/field")));		// false
		System.out.println(Files.isRegularFile(Paths.get("c:/temp/Test.java")));	// true
		System.out.println(Files.isSymbolicLink(Paths.get("c:/temp/field")));		// false

	}

}
