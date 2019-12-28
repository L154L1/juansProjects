// What is the result?
// A. 5 : 3 : 6
// B. 6 : 5 : 6
// C. 3 : 3 : 4
// D. 4 : 4 : 4

//Answer: A

package q86_relativize_getNameCount;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		Path path1 = Paths.get("/software/././sys/readme.txt");
		Path path2 = path1.normalize();
		Path path3 = path2.relativize(path1);
		
		System.out.println(path3);	// ..\..\.\.\sys\readme.txt
		System.out.println();
		
		System.out.print(path1.getNameCount());
		System.out.print(" : " + path2.getNameCount());
		System.out.print(" : " + path3.getNameCount());

	}

}

// 5 : 3 : 6