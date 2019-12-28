//Given that /green.txt and /colors/yellow.txt are accessible, and the code fragment:

// Which statement is true?
//	A. The green.txt file content is replaced by the yellow.txt file content and the yellow.txt file is deleted.
//	B. The yellow.txt file content is replaced by the green.txt file content and an exception is thrown.
//	C. The file green.txt is moved to the /colors directory.
//	D. A FileAlreadyExistsException is thrown at runtime.

//	Correct Answer: B

package q47_Files_move;

import java.nio.file.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
//		Path source = Paths.get("/green.txt");
//		Path target = Paths.get("/colors/yellow.txt");
		Path source = Paths.get("C:/temp/green.txt");
		Path target = Paths.get("C:/temp/colors/yellow.txt");
		
		//Files.move(source, target);		// This will throw FileAlreadyExistsException
		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);		// This will replace the content of target with source.
		
		Files.delete(source);		// throws NoSuchFileException because source has been moved to target.

	}

}
