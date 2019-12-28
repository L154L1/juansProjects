// Q49 : Assuming that the file /giraffe/food.csv exists within the file system and that it is not empty, what is the result of executing the following code? 

// Answer - The code prints a series of numbers.

package q49;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/giraffe/food.csv");
		Files.lines(path)
		.flatMap(p -> Stream.of(p.split(","))) // j1
		.map(s -> s.length()) // j2
		.collect(Collectors.toList())
		.forEach(System.out::print); // j3

	}

}
