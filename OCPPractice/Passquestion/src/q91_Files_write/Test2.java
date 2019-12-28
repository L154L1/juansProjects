package q91_Files_write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		try {
			List<String> content = Files.readAllLines(Paths.get("C:/temp/employee.txt"));
			content.stream().forEach(line -> {
			
				try {
					Files.write(
							Paths.get("C:/temp/allemp.txt"), 
							line.getBytes(),
							StandardOpenOption.APPEND);		
					
				} catch(IOException e) { e.printStackTrace(); }		// java.nio.file.NoSuchFileException: C:\temp\allemp.txt
					
				
			});
			
		} catch(IOException e) { System.out.println("Exception 2"); }


	}

}
