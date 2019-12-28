// Q. 7  	Assuming that the current directory is /mammals and the directories and files referenced by the program exist, what is true about the following code snippet?

// Answer : F.	The code compiles without issue but throws an exception at runtime.

// The path on the first line is relative, and calling normalize() on it does not change this property. Therefore, since calling getRoot() on any relative path will result in a null value, 
// the code will throw a NullPointerException on the next line,

package q7;

import java.nio.file.*;
import java.util.stream.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("bear/polar/./environment").normalize().getRoot(); // w1	returns null		
		System.out.println(Files.list(path)
		.filter(p -> !Files.isDirectory(p)) // w2
		.map(p -> p) // w3
		.collect(Collectors.toSet())
		.size());

	}

}
