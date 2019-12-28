// getFileName()
// getRoot() method returns the root element for the Path object or null if the Path object is relative.
// getParent()

package p462_use_Path_object;

import java.nio.file.*;

public class Test2_getFileName_getRoot_getParent {
	
	public static void printPathInformation(Path path) {
		System.out.println("Filename is: "+path.getFileName());
		System.out.println("Root is: "+path.getRoot());
		
		Path currentParent = path;
		while((currentParent = currentParent.getParent()) != null) {
			System.out.println("	Current parent is: "+currentParent);
		}
	}

	public static void main(String[] args) {
		printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));

	}

}


//Filename is: shells.txt
//Root is: \
//	Current parent is: \zoo\armadillo
//	Current parent is: \zoo
//	Current parent is: \
//
//Filename is: shells.txt
//Root is: null
//	Current parent is: armadillo