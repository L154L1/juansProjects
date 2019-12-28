// Q13 - Assume /monkeys exists as a regular directory containing multiple files, symbolic links, and subdirectories. What is true about the following code? 

// The key here is that the depth parameter specified as the second argument to find() is 0, meaning the only record that will be searched is the top-level directory. 
// Since we know that the top directory is regular and not a symbolic link, no other paths will be visited and nothing will be printed. 
// For these reasons, B is the correct answer - It will print nothing.

package q13;

import java.nio.file.*;
import java.util.stream.*;
import java.io.*;

public class Test {

	public static void main (String[] args) throws IOException {
		Path path = Paths.get("/monkeys");
		Files.find(path, 0, (p,a) -> a.isSymbolicLink()).map(p -> p.toString()) // y1
		.collect(Collectors.toList()) // y2
		.stream() // y3
		.filter(x -> x.toString().endsWith(".txt")) // y4
		.forEach(System.out::println);

	}

}
