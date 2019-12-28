// Read and write file data with Files.newBufferedReader() and Files.newBufferedWriter()

package p472_interact_with_Files;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Test6_newBufferedReader_Writer {

	public static void main(String[] args) {
		Path path = Paths.get("c:/temp/studynotes.txt");
		try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("US-ASCII"))){
			//Read from the stream
			String currentLine = null;
			while((currentLine = reader.readLine()) != null) 
				System.out.println(currentLine);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Path path2 = Paths.get("c:/temp/studynotes2.txt");
		try(BufferedWriter writer = Files.newBufferedWriter(path2, Charset.forName("UTF-16"))){
			writer.write("Hello World");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
