

package q44;

import java.nio.file.*;
import java.io.*;

public class Test_correction {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/storage","toys").resolve("bird"); // n1
		Files.find(path,2,(p,a) -> a.isDirectory()) // n2
		.map(p -> {
			try {
				return p.toRealPath(LinkOption.NOFOLLOW_LINKS);
			} catch (IOException e) {
				e.printStackTrace();
				return p;
			}
		}) // n3
		.map(p -> p.normalize()) // n4
		.forEach(System.out::print);

	}

}
