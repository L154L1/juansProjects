// Files.exists(Path)
// this method does not throw an exception if the file does not exist. It returns false instead.

package p472_interact_with_Files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Test1_exists {

	public static void main(String[] args) {
		System.out.println(Files.exists(Paths.get("/ostrich/feathers.png")));	// false
		System.out.println(Files.exists(Paths.get("c:/temp")));					// true

	}

}
