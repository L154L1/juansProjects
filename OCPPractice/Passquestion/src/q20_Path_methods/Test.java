// What is the result?

// Answer: B. 2:MyPic.jpeg:MyPic.jpeg

package q20_Path_methods;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		Path p1 = Paths.get("/Pics/MyPic.jpeg");
		System.out.println(p1.getNameCount() + ":" + p1.getName(1) + ":" + p1.getFileName());		// 2:MyPic.jpeg:MyPic.jpeg

	}

}
