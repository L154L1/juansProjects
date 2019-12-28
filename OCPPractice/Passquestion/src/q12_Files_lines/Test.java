// Path file = Paths.get (“courses.txt”);
// // line n1

// Assume the courses.txtis accessible.
// Which code fragment can be inserted at line n1 to enable the code to print the content of the courses.txt file?
// A. List<String> fc = Files.list(file);
//    fc.stream().forEach (s - > System.out.println(s));
// B. Stream<String> fc = Files.readAllLines (file);
//    fc.forEach (s - > System.out.println(s));
// C. List<String> fc = readAllLines(file);
//    fc.stream().forEach (s - > System.out.println(s));
// D. Stream<String> fc = Files.lines (file);
//    fc.forEach (s - > System.out.println(s));

// Answer: D

package q12_Files_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get ("C:/temp/courses.txt");
		
		//line n1
		Stream<String> fc = Files.lines (file);		// D
		fc.forEach (s -> System.out.println(s));
	}

}
