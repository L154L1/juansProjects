// Q. 17  	If the current working directory is /coralreef, then what is the output of the following code?

// The code will throw an exception at runtime because of the chaining together of methods getRoot().getParent(). 
// The root path has no parent path, so this snippet will return null and the operation resolve() will throw a NullPointerException at runtime.

package q17;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Test {

	public static void main(String[] args) {
		Path userDirectory = Paths.get("/coralreef/../clown/fish").normalize(); // m1			\clown\fish		
		Path pantherDirectory = userDirectory.getRoot().getParent().resolve("dolphin"); // m2		throws NullPointerException
		System.out.println(pantherDirectory.toAbsolutePath()); // m3

	}

}
