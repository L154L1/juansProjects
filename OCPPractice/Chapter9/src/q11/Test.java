package q11;
import java.nio.file.*;
import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("C:/temp/./goat.txt").normalize(); // k1
		Path path2 = Paths.get("C:/temp/mule.png");
		Files.copy(path1,path2,StandardCopyOption.COPY_ATTRIBUTES); //k2
		System.out.println(Files.isSameFile(path1, path2)); //k3			// false

	}

}
