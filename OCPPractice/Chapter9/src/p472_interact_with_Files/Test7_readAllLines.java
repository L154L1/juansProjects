// Read files with Files.readAllLine(path) - return a List<String>
// Note : entire file is read when readAllLines() is called, with the resulting String array storing all of the contents of the file in memory at once.
// therefore, if the file is significantly large, you may encounter an OutOfMemory error.

// Note : Files.lines(path) returns a Stream<String> which will not have memory problem because stream uses lazy evaluation.

package p472_interact_with_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test7_readAllLines {

	public static void main(String[] args) {
		Path path = Paths.get("c:/temp/studynotes.txt");
		try {
			final List<String> lines = Files.readAllLines(path);
			for(String line: lines) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
