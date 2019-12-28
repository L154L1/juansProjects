// Given the content of the employee.txt file :
// Every worker is a master

// Given that the employee.txt file is accessible and the file allemp.txt does not exist.

// What is the result?
// A. Exception 1
// B. Exception 2
// C. The program executes, does not affect the system, and produces no output.
// D. allemp.txt is created and the content of employee.txt is copied to it.

// Answer : A

// StandardOpenOption.APPEND requires a existing file, throws IOException otherwise.
// Change to StandardOpenOption.CREATE will work, but the line written later will override the previous line if the content is multiple lines in employee.txt.

package q91_Files_write;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		try {
			List<String> content = Files.readAllLines(Paths.get("C:/temp/employee.txt"));
			content.stream().forEach(line -> {
				try {
					Files.write(
							Paths.get("C:/temp/allemp.txt"), 
							line.getBytes(),
							StandardOpenOption.APPEND);		
					
				} catch(IOException e) { System.out.println("Exception 1"); }
			});
			
		} catch(IOException e) { System.out.println("Exception 2"); }

	}

}
