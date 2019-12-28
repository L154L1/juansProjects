// Files.isHidden(Path)

// In Linux or Mac-based systems, hidden file is often denoted by file or directory entries that begin with a period(.) character., 
// while in Windows-based systems, this requires the hidden attribute to be set.
// isHidden() method throws IOException, as their maybe an I/O error reading the underlying file information.
// It also throws IOException when the file or directory does not exist.

// Files.isReadable(Path)
// Files.isExecutable(Path)

// isReadable() and isExecutable don't throw exception if the file or directory does not exist. They just return false

package p478_access_file_attributes;

import java.io.IOException;
import java.nio.file.*;

public class Test2 {

	public static void main(String[] args) {
		try {
			System.out.println(Files.isHidden(Paths.get("c:/temp/Test.java")));
			
			System.out.println(Files.isReadable(Paths.get("c:/temp/Test3.java")));		
			System.out.println(Files.isExecutable(Paths.get("c:/temp/Test3.java")));
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
