//Q. 6  	Assuming that the file /own/food/nocturnal.png exists within the file system, what is the result of executing the following code?

// D.	The code will not compile because of line b3.

// The code does not compile because the method Path.getNameCount() does not take any arguments, so b3 will not compile and D is correct. 
// The rest of the lines are fine, since Files.walk() may take a length and file options argument for handling symbolic links. 
// If line b3 were corrected to remove the argument, then E would be correct - 	The codes a list of file paths that end in .txt that have at least four components of their path.

package q6;

import java.nio.file.*;

public class Test {

	public static void main(String[] args) {
		Path path = Paths.get("/owl/food/nocturnal.png").getParent();

		Files.walk(path, 5, FileVisitOption.FOLLOW_LINKS) // b1
		.filter(p -> p.resolve(p).getFileName().toString().endsWith(".txt")) // b2
		.filter(p -> p.getNameCount(0)>4) // b3
		.forEach(p -> System.out.println(p.toRealPath()));

	}

}
