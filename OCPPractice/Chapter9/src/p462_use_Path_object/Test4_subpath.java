// subpath(int, int) returns a relative subpath of the Path object, referenced by an inclusive start index and an exclusive end index.
package p462_use_Path_object;

import java.nio.file.*;

public class Test4_subpath {

	public static void main(String[] args) {
		Path path = Paths.get("/mammal/carnivor/raccoon.image");
		System.out.println("Path is: " + path);
		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0, 3));
		System.out.println("Subpath from 1 to 3 is: "+path.subpath(1, 3));
		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1, 2));
		
		//System.out.println("Subpath from 1 to 3 is: "+path.subpath(0, 4));		// throw java.lang.IllegalArgumentException because the maximum index allowed is 3
		//System.out.println("Subpath from 1 to 2 is: "+path.subpath(1, 1));		// throw java.lang.IllegalArgumentException because start and end index are the same, leading to an empty path value

	}

}


//Path is: \mammal\carnivor\raccoon.image
//Subpath from 0 to 3 is: mammal\carnivor\raccoon.image
//Subpath from 1 to 3 is: carnivor\raccoon.image
//Subpath from 1 to 2 is: carnivor