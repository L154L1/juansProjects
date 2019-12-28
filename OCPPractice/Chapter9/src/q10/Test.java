// If c:/temp/animals exists, it will be overwritten at runtime.
// A should be correct answer.

package q10;
import java.nio.file.*;
import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException {
		Files.move(Paths.get("c:/temp/monkey.txt"), Paths.get("c:/temp/animals"),
				StandardCopyOption.ATOMIC_MOVE,
				LinkOption.NOFOLLOW_LINKS);

	}

}
