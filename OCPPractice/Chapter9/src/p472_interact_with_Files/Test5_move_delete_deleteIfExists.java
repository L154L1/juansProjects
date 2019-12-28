// Files.move(Path, Path) - moves or renames a file or directory

// Files.delete(Path) - deletes a file or empty directory
// Files.deleteIfExists(Path) - identical to File.delete(Path), except that it will not throw an exception if the file or directory does not exist, but instead it will return boolean value false.

package p472_interact_with_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test5_move_delete_deleteIfExists {

	public static void main(String[] args) {
		try {
			
			// Rename a directory, the target directory must not exist.
//			Files.move(Paths.get("c:/temp3"), Paths.get("c:/temp4"));
			
//			// Move a file to another location, the target file must not exist
			Files.move(Paths.get("c:/temp/animal.data"), Paths.get("c:/temp2/animal.txt"));
//			
//			// Delete a file 
//			Files.delete(Paths.get("c:/temp2/Test.java"));
//			
//			// Delete an empty directory
//			Files.delete(Paths.get("c:/temp4/field"));
//			
//			Files.deleteIfExists(Paths.get("c:/temp2/Test.java"));
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IOException caught!");
		}

	}

}
