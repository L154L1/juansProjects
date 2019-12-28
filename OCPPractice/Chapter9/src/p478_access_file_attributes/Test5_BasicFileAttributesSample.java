// Files.readAttributes(Path, Class<A>)  - returns read-only version of a file view.

// the fileKey() method returns a file system value that represents a unique identifier for the file within the file system or null if it is not supported by the file system.


package p478_access_file_attributes;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Test5_BasicFileAttributesSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/temp/Test.java");
		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
		
		System.out.println("Is path a directory? "+data.isDirectory());
		System.out.println("Is path a regular file? "+data.isRegularFile());
		System.out.println("Is path a symbolic link? "+data.isSymbolicLink());
		System.out.println("Path not a file, directory, nor symbolic link? "+data.isOther());
		System.out.println("Size (in bytes)? "+data.size());
		System.out.println("Creation date/time? "+data.creationTime());
		System.out.println("Last modified date/time? "+data.lastModifiedTime());
		System.out.println("Last accessed date/time? "+data.lastAccessTime());
		System.out.println("Unique file idetifier (if available)? "+data.fileKey());

	}

}


//Is path a directory? false
//Is path a regular file? true
//Is path a symbolic link? false
//Path not a file, directory, nor symbolic link? false
//Size (in bytes)? 194
//Creation date/time? 2018-10-28T16:40:16.454345Z
//Last modified date/time? 2019-05-19T19:57:20.323Z
//Last accessed date/time? 2018-10-28T16:40:16.532461Z
//Unique file idetifier (if available)? null
