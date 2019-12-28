// Files.createDirectory(Path)  (java.io - file.mkdir())
// Files.createDirectories(Path)  (java.io - file.mkdirs())

// The directory-creation methods can throw IOException, such as when the directory cannot be created or or already exists.

// createDirectory(Path) 
// - throws IOException (NoSuchFileException) if the parent directory in which the new directory resides does not exist.
// - throws IOException (FileAlreadyExistsException) if file already exists.

// createDirectories(Path) will create the directory along with any of the following parent directories if they don't exist. It will not throw IOException even the path already exists. It will just ignore.


package p472_interact_with_Files;
import java.io.IOException;
import java.nio.file.*;
public class Test3_createDirectory_createDirectories {

	public static void main(String[] args) {
		try {
			//Files.createDirectory(Paths.get("c:/temp2/field"));
			Files.createDirectories(Paths.get("c:/temp3/field"));
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IOException caught!");
		}

	}

}
