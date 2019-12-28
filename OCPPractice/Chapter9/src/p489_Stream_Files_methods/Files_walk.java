// File.walk(Path) method returns a Stream<Path> object that traverses in a depth-first, lazy manner.
// By lazy, we mean the set of elements is built and read while the directory is being traversed.

// By default, the method iterates up to Integer.MAX-VALUE directories deep, although there is a overloaded version of walk(Path, int) 
// that takes a maximum directory depth integer value as the second parameter. A value of 0 indicates the current path record itself.

package p489_Stream_Files_methods;

import java.nio.file.*;
import java.io.*;

public class Files_walk {

	public static void main(String[] args) {
		Path path = Paths.get("c:/temp");
		try {
//			Files.walk(path)
//			.filter(p -> p.toString().endsWith(".java"))
//			.forEach(System.out::println);
			
			/*
			 	c:\temp\ConsoleSample.java
				c:\temp\field\Test.java
				c:\temp\MainTest.java
				c:\temp\monkey\Test.java
				c:\temp\packagea\ClassA.java
				c:\temp\packageb\ClassB.java
				c:\temp\SystemInSample.java
				c:\temp\Test.java
				c:\temp\tree\test\Test.java
				c:\temp\tree\Test.java
			 */
			
			
			System.out.println();
			
			Files.walk(path, 0)
			.filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);					// value of 0 means the current path c:/temp itself, it's not .java file.
															// value of 1 means 1 level deep down.
			
			System.out.println();
			
			Files.walk(path, 1)
			.filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);	
			
			/*
			 	c:\temp\ConsoleSample.java
				c:\temp\MainTest.java
				c:\temp\SystemInSample.java
				c:\temp\Test.java
			 */
			
			
		} catch(IOException e) {
			
		}

	}

}
