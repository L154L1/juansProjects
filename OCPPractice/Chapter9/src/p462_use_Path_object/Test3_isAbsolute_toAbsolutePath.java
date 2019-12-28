// isAbsolute()
// toAbsolutePath() - converts a relative Path object to an absolute Path object by joining it to the current working directory. 
// If the Path object is already absolute, it returns an equivalent copy of it.

// Absolute and relative path types are file system dependent.

package p462_use_Path_object;

import java.nio.file.*;

public class Test3_isAbsolute_toAbsolutePath {

	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? " + path1.isAbsolute());		// true
		System.out.println("Absolute Path1: " + path1.toAbsolutePath());	// C:\birds\egret.txt
		
		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is Absolute? " + path2.isAbsolute());		// false
		System.out.println("Absolute Path2: " + path2.toAbsolutePath());	// C:\D\OCPPractice\Chapter9\birds\condor.txt
		
		System.out.println(Paths.get("/stripes/zebra.exe").isAbsolute());	// On Windows, outputs false
		System.out.println(Paths.get("c:/goats/Food.java").isAbsolute());	// On Windows, outputs true
		

	}

}
