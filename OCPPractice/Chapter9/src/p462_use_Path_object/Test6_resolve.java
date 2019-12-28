// resolve() - joining path objects

// The Path object on which the resolve() method is invoked becomes the basis of the new Path object, with the input argument being appended onto the Path.

// If an absolute path is provided as input to the method, such as path1.resolve(path2), the path1 will be ignored and a copy of path2 would be returned.

// resolve() method does not clean up path symbols, such as the parent direcrtory .. symbol. normalize() method does.

package p462_use_Path_object;

import java.nio.file.*;

public class Test6_resolve {

	public static void main(String[] args) {
		
		final Path path1 = Paths.get("/cats/../panther");
		final Path path2 = Paths.get("food");
		System.out.println(path1.resolve(path2));		// \cats\..\panther\food
		
		//System.out.println(Paths.get("/cats/../panther", "food"));	// \cats\..\panther\food (same result as above)
		
		final Path path5 = Paths.get("cats/../panther");
		final Path path6 = Paths.get("food");
		System.out.println(path5.resolve(path6));		// cats\..\panther\food
				
		final Path path3 = Paths.get("/turkey/food");
		final Path path4 = Paths.get("/tiger/cage");
		System.out.println(path3.resolve(path4));		// \tiger\cage
		
	}

}
