// Q. 18  	Assuming the directories and files referenced here all exist and are accessible within the file system, what is the result of the following code?

package q18;
import java.nio.file.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("c:/temp/lizard/./").resolve(Paths.get("walking.txt"));
		Path path2 = new File("c:/temp/lizard/././actions/../walking.txt").toPath();

		System.out.print(Files.isSameFile(path1,path2));					// true
		System.out.print(" "+path1.equals(path2));							// false
		System.out.print(" "+path1.normalize().equals(path2.normalize()));	// true

	}

}
