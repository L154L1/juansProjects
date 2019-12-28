// Two things to remember for resolve() -
// - The resolve() method does not normalize any path symbols.
// - Calling resolve() with an absolute path as a parameter returns the absolute path.

package q8;

import java.nio.file.*;

public class Test {

	public static void main(String[] args) {
		Path path1 = Paths.get("/pets/../cat.txt");
		Path path2 = Paths.get("./dog.txt");
		System.out.println(path1.resolve(path2));	// \pets\..\cat.txt\.\dog.txt
		System.out.println(path2.resolve(path1));	// \pets\..\cat.txt

	}

}
