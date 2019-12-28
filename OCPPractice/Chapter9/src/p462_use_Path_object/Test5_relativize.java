// relativize() - constructing the relative path from a base Path to a target path.
// It means you current path is base path. Find a relative path you can change path to the target path.
// basePath.relativize(path)

// If both path values are relative, then the relativize() method computes the paths as if they are in the same current working directory.
// If both path values are absolute, then the relativize() method computes the relative path from one absolute location to another, regardless of the current working directory.

// relativize() method requires both paths be absolute or both relative. It will throw an IllegalArgumentException if a relative path is mixed with an absolute path.
// On Windows-based systems, it also requires that if absolute paths are used, both paths must have the same root directory or drive letter, otherwise will throw an IlegalArgumentException.

package p462_use_Path_object;

import java.nio.file.*;

public class Test5_relativize {

	public static void main(String[] args) {
//		Path path1 = Paths.get("fish.txt");
//		Path path2 = Paths.get("birds.txt");
//		System.out.println(path1.relativize(path2));	// ..\birds.txt
//		System.out.println(path2.relativize(path1));	// ..\fish.txt
		
//		Path path3 = Paths.get("E:\\habitat");
//		Path path4 = Paths.get("E:\\sanctuary\\reven");
//		System.out.println(path3.relativize(path4));	// ..\sanctuary\reven
//		System.out.println(path4.relativize(path3));	// ..\..\habitat
		
//		Path path5 = Paths.get("/primate/chimpanzee");
//		Path path6 = Paths.get("bananas.txt");
//		//path5.relativize(path6);		// throw java.lang.IllegalArgumentException
		
//		Path path7 = Paths.get("c:\\primate\\chimpanzee");
//		Path path8 = Paths.get("d:\\storage\\bananas.txt");
//		//path7.relativize(path8);		// throw java.lang.IllegalArgumentException
		
//		Path pathAbsolute = Paths.get("/var/data/stuff/xyz.dat");
//        Path pathBase = Paths.get("/var/data");
//        Path pathRelative = pathBase.relativize(pathAbsolute);
//        System.out.println(pathRelative);	// stuff\xyz.dat       
//        Path pathRelative2 = pathAbsolute.relativize(pathBase);
//        System.out.println(pathRelative2);	// ..\..
        
        
//        Path path9 = Paths.get("/var/xyz.dat");
//        System.out.println(path9.relativize(Paths.get("/var/./xyz.dat")));	// ..\.\xyz.dat
       
//        Path path10 = Paths.get("/var/xyz.dat");
//        System.out.println(path10.relativize(Paths.get("/var/xyz.dat")));	// prints nothing
        
        Path path11 = Paths.get("var/xyz.dat");
        System.out.println(path11.relativize(Paths.get("var/xyz.dat")));	// prints nothing
		
		
	}

}
