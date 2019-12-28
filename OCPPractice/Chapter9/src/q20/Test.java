package q20;
import java.nio.file.*;
public class Test {

	public static void main(String[] args) {
		final Path path = Paths.get(".").normalize(); // h1
		
		System.out.println("path.getNameCount: " + path.getNameCount());
		
		int count = 0;
		for(int i=0; i<path.getNameCount(); ++i) {
		count++;
		}
		System.out.println(count);		// 1

	}

}
