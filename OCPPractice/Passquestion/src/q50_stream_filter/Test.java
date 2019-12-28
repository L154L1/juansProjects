// What is the result?
// A. The program prints the content of data.txt file
// B. The program prints: Exception <<The content of the data.txt file>> Exception
// C. A compilation error occurs at line n1.
// D. The program prints the content of the three files.

// Answer: A

package q50_stream_filter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		Stream<Path> paths = Stream.of(Paths.get("c:/temp/data.doc"), Paths.get("c:/temp/data.txt"), Paths.get("c:/temp/data.xml"));
		paths.filter(s -> s.toString().endsWith("txt")).forEach(
				s -> {
					try {
						Files.readAllLines(s)
						.stream()
						.forEach(System.out::println);	//line n1
						
					} catch(IOException e) {
						System.out.println("Exception");
					}
				});

	}

}
