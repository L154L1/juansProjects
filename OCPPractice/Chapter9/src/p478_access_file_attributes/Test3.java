// Files.size(Path) - used to determine the size of the file in bytes (long value).
// Note : Files.size() is defined only on files. Calling Files.size() on a directory is system dependent and undefined.

// Files.getLastModifiedTime(Path) - return a FileTime object. FileTime has a toMillis() method that returns epoch time.
// Files.setLastModifiedTime(Path,FileTime) - FileTime class also has a fromMillis() method that converts epoch time to FileTime object.


package p478_access_file_attributes;

import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.nio.file.*;
import java.io.*;

public class Test3 {

	public static void main(String[] args) {
		try {
			System.out.println(Files.size(Paths.get("c:/temp/studynotes.txt")));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			final Path path = Paths.get("c:/temp/Test.java");
			System.out.println(Files.getLastModifiedTime(path).toMillis());
			
			Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
			
			System.out.println(Files.getLastModifiedTime(path).toMillis());
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
