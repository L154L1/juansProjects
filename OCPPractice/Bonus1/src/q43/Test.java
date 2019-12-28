// Q43 :  What statements about the following code are true? (Choose all that apply)

// The answer should be that the code does not compile because of unhandled IOException

package q43;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/zoo/gorilla.txt");
		try (BufferedReader reader = Files.newBufferedReader(path)) { // x1
		String s = null;
		while(reader.readLine() != null) // x2
		System.out.println(s); // x3
		}

	}

}
