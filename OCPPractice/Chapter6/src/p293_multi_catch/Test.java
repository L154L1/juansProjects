// The exceptions in multi-catch must be unrelated.
// When using multi-catch, the exception variable becomes effective final

package p293_multi_catch;

import java.nio.file.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class Test {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("dolphinBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		} catch(DateTimeParseException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
		// When using multi-catch, the exception variable becomes effective final
		try {
			// do somethin
		}catch(RuntimeException e) {
			e = new RuntimeException();		// compiles
		}

		try {
			throw new IOException();
		}catch(IOException | RuntimeException e) {
			e = new RuntimeException();		// doesn't compile
		}

	}

}
