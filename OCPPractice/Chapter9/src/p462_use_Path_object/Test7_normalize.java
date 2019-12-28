// normalize()
// as we can construct relative paths using .. or . symbol values. There are times when relative paths are combined such that there are redundancies in the path value. 
// Java provides us with the normalize(Path) method to eliminate the redundancies in the path.

package p462_use_Path_object;

import java.nio.file.*;

public class Test7_normalize {

	public static void main(String[] args) {
		Path path1 = Paths.get("E:\\data");
		Path path2 = Paths.get("E:\\user\\home");
		
//		Path relativePath = path1.relativize(path2);
//		System.out.println(relativePath);								// ..\User\home
//		System.out.println(path1.resolve(relativePath));				// E:\data\..\User\home
//		System.out.println(path1.resolve(relativePath).normalize());	// E:\User\home
		
//		System.out.println(Paths.get("/data/../zoo/food.txt").normalize());		// \zoo\food.txt
//		System.out.println(Paths.get("/data/../zoo/./food.txt").normalize());	// \zoo\food.txt
		
		System.out.println(Paths.get("data/../zoo/food.txt").normalize());		// zoo\food.txt
		System.out.println(Paths.get("data/../zoo/./food.txt").normalize());	// zoo\food.txt

	}

}
