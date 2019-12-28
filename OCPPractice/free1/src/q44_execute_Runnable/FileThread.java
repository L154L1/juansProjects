// The Java Projects directory exists and contains a list of files.
// What is the result?
// A. The program throws a runtime exception at line n2.
// B. The program prints files names concurrently.
// C. The program prints files names sequentially.
// D. A compilation error occurs at line n1.

// Correct Answer: B


package q44_execute_Runnable;

import java.util.concurrent.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class FileThread implements Runnable {
	
	String fName;
	public FileThread(String fName) { this.fName = fName; }
	public void run() {System.out.println(fName);}
	
	public static void main (String[] args) throws IOException, InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		//Stream<Path> listOfFiles = Files.walk(Paths.get("Java Projects"));
		Stream<Path> listOfFiles = Files.walk(Paths.get("C:/temp"));
		listOfFiles.forEach(line -> {
			executor.execute(new FileThread(line.getFileName().toString())); // line n1
		});
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS); // line n2
	}
}



