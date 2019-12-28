// Q. 44  	Assuming that the path values referenced here exist and are accessible within the file system, what is the result of executing the following code? (Choose all that apply.)

// Answer - 
// B.	The code will not compile because of line n2.
// D.	The code will not compile because of line n4.

// First, the method Files.find() requires the second parameter to be a depth limit; therefore line n2 would have to be changed to allow the code to compile
// Second, the output on line n3 is a String; therefore the normalize() method call on line n4 would have to be changed to allow the code to compile.


package q44;

import java.nio.file.*;

public class Test {

	public static void main(String[] args) {
		Path path = Paths.get("/storage","toys").resolve("bird"); // n1
		Files.find(path,(p,a) -> a.isDirectory()) // n2
		.map(p -> p.toRealPath(LinkOption.NOFOLLOW_LINKS).toString()) // n3
		.map(p -> p.normalize()) // n4
		.forEach(System.out::print);

	}

}
