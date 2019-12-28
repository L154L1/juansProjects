// Passquestion q50

//The data.doc, data.txt and data.xml files are accessible and contain text.
//Given the code fragment:

//What is the result?
//A. The program prints the content of data.txt file.

package q28_stream_filter;

import java.nio.file.*;
import java.util.stream.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		Stream<Path> paths = Stream.of (Paths. get("data.doc"),
				Paths. get("data.txt"),
				Paths. get("data.xml"));
				paths.filter(s-> s.toString().endsWith("txt")).forEach(
				s -> {
				try {
				Files.readAllLines(s)
				.stream()
				.forEach(System.out::println); //line n1
				} catch (IOException e) {
					System.out.println("Exception");
				}
				}
				);

	}

}
