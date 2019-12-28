// Printing path object will invoke its toString() method.
// path.getNameCount()
// path.getName(int)


// The root element / is not included in the list of names.

package p462_use_Path_object;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test_getName_getNameCount {

	public static void main(String[] args) {
		System.out.println(Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath());		// C:\
		
		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: " + path);	// The Path Name is: \land\hippo\harry.happy
		System.out.println("path.getNameCount(): " + path.getNameCount());	// 3
		
		for(int i=0; i<path.getNameCount(); i++) {
			System.out.println("	Element " + i +" is: " + path.getName(i));
		}
		
		Path path2 = Paths.get("land/hippo/harry.happy");
		System.out.println("The Path Name is: " + path2);	// The Path Name is: land\hippo\harry.happy
		System.out.println("path2.getNameCount(): " + path2.getNameCount());	// 3
		
		for(int i=0; i<path2.getNameCount(); i++) {
			System.out.println("	Element " + i +" is: " + path2.getName(i));
		}
		
		Path path3 = Paths.get("/");
		System.out.println("The Path Name is: " + path3);	// The Path Name is: \
		System.out.println("path3.getNameCount(): " + path3.getNameCount());	// path3.getNameCount(): 0
		
		Path path4 = Paths.get(".");
		System.out.println("The Path4 Name is: " + path4);	// The Path4 Name is: .
		System.out.println("path4.getNameCount(): " + path4.getNameCount());	// 1
				
		Path path5 = Paths.get("..");
		System.out.println("The Path5 Name is: " + path5);	// The Path5 Name is: ..
		System.out.println("path5.getNameCount(): " + path5.getNameCount());	// 1
		
		
		

	}

}
