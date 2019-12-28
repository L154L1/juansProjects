// Files.copy(Path, Path)
// Files.copy(InputStream, Path)
// Files.copy(Path, OutputStream)

// InputStream and OutputStream in the 2nd and 3rd method could refer to any valid stream, including website connections, in-memory stream, and so forth.

// The copy() method throws IOException such as when the source file or directory does not exist or target file already exists.

// Note : A instance of java.io.File doesn't have move() and copy() method. Copying a file with java.io would require reading the contents using a stream.

package p472_interact_with_Files;
import java.io.IOException;
import java.nio.file.*;
import java.io.*;
public class Test4_copy {

	public static void main(String[] args) {
		try {
				Files.copy(Paths.get("c:/temp/Test.java"), Paths.get("c:/temp2/Test.java"));
				Files.copy(Paths.get("c:/temp/Test.java"), Paths.get("c:/temp2/Test_copy.java"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(InputStream is = new FileInputStream("c:/temp/animal.data");
				OutputStream out = new FileOutputStream("c:/temp3/animal.data")) {
			
			// Copy stream data to file
			Files.copy(is, Paths.get("c:/temp2/animal.data"));
			
			// Copy file data to stream
			Files.copy(Paths.get("c:/temp2/animal.data"), out);
			
			//Files.copy(is, out);  // Doesn't compile.
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
