// Files.lines(Path) - returns a Stream<String>

// Earlier we said Files.readAllLines(Path) could run into OutOfMemoryError problem when the file is very large. 
// Files.lines(Path) method that returns a Stream<String> object and does not suffer from this same issue. 
// The contents of the file are read and processed lazily, which means that only a small portion of the file is stored in memory at any given time.

// It's more performant on reading large files, since it does not require the entire file to be read and stored in memory. 


package p489_Stream_Files_methods;

import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Files_lines {

	public static void main(String[] args) {
		
		Path path = Paths.get("c:/temp/zoo.log");
		try {
			Files.lines(path).forEach(System.out::println);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			List<String> list = Files.lines(path)
			.filter(s -> s.startsWith("WARN "))
			.map(s -> s.substring(5))
			.collect(Collectors.toList());
			
			System.out.println(list);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
