// Paths.get() method is the same for the class java.nio.file.FileSystem method getPath().

package p459_access_file_system;

import java.net.*;
import java.nio.file.*;

public class Test {

	public static void main(String[] args) throws URISyntaxException {
		
		Path path1 = FileSystems.getDefault().getPath("/alligator/swim.txt");
		
		// FileSystem getPath also gives us ability to connect to a remote file system, as shown :
		FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
		Path path = fileSystem.getPath("duck.txt");

	}

}
