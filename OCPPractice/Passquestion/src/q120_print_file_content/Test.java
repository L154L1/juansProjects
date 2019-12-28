// Assume customers.txt is accessible and contains multiple lines. Which code fragment prints the content of the customers.txt file?
// A. Stream<String> stream = Files.find(Paths.get("customers.txt")); stream.forEach(c -> System.out.println(c));
// B. Stream<Path> stream = Files.find(Paths.get("customers.txt")); stream.forEach(c -> System.out.println(c));
// C. Stream<Path> stream = Files.list(Paths.get("customers.txt")); stream.forEach(c -> System.out.println(c));
// D. Stream<String> lines = Files.lines(Paths.get("customers.txt")); lines.forEach(c -> System.out.println(c));

// Answer: D

package q120_print_file_content;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		//Stream<String> stream = Files.find(Paths.get("customers.txt")); stream.forEach(c -> System.out.println(c));		// A - does not compile
		
		Stream<String> lines = Files.lines(Paths.get("customers.txt")); lines.forEach(c -> System.out.println(c));		// D
		//Stream<String> lines = Files.lines(Paths.get("C:\\temp\\studynotes.txt")); lines.forEach(c -> System.out.println(c));

	}

}
