// Files.find(Path, int, BiPredicate) - returns a Stream<Path> using a BiPredicate which takes two generic objects - in this case, two object types are Path and BasicFilterAttributes.

package p489_Stream_Files_methods;

import java.nio.file.*;
import java.io.*;
import java.util.stream.Stream;

public class Files_find {

	public static void main(String[] args) {
		Path path = Paths.get("c:/temp");
		long dateFilter = 1420070400000L;
		try {
			Stream<Path> stream = Files.find(path, 10, (p,a) -> p.toString().endsWith(".java")
					&& a.lastModifiedTime().toMillis()>dateFilter);
			
			stream.forEach(System.out::println);
		}catch(IOException e) {
			
		}

	}

}
