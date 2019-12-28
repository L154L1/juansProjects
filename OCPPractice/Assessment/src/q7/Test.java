// Q. 7  	Assuming the current directory /bats/day and all of the files and directories referenced here exist and are available within the file system, what is the result of executing the following code?

// Answer : true true

package q7;

import java.nio.file.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("/bats/night","../").resolve(Paths.get("./sleep.txt")).normalize();
		Path path2 = new File("../sleep.txt").toPath().toRealPath();

		System.out.print(Files.isSameFile(path1,path2));
		System.out.print(" "+path1.equals(path2));
		
	}

}
