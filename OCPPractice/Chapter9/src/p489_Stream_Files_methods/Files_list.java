// Files.list(Path) - returns a Stream<Path> that represents all entries within the path.

// Files.list searches one level deep and is analogous to java.io.File.listFiles(), except it returns Stream.

package p489_Stream_Files_methods;

import java.nio.file.*;
import java.io.*;

public class Files_list {

	public static void main(String[] args) {
		
		try {
			Path path = Paths.get("c:/temp");
			Files.list(path)
			.filter(p -> !Files.isDirectory(p))
			.map(p -> p.toAbsolutePath())
			.forEach(System.out::println);
			
			System.out.println();
			
			// using Files.walk() with depth level 1 will output the same result.
			Path path2 = Paths.get("c:/temp");
			Files.walk(path2, 1)
			.filter(p -> !Files.isDirectory(p))
			.map(p -> p.toAbsolutePath())
			.forEach(System.out::println);
			
			
		}catch(IOException e) {
			
		}
		
		
//		File file = new File("c:/temp");
//		File[] files = file.listFiles();
//		for(File f: files) System.out.println(f);
		

	}

}
