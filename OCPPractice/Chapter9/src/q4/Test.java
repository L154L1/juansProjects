package q4;

import java.nio.file.*;

public class Test {

	public static void main(String[] args) {
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(path.subpath(1,3).getName(1).toAbsolutePath());	// C:\OCP\OCPPractice\Chapter9\bear

	}

}
