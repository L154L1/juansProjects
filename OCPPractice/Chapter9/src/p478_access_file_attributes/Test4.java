// Files.getOwner(Path) - returns an instance of UserPrincipal that represents the owner of the file within the file system.
// Files.setOwner(Path, UserPrincipal) - Note that the operating system might intervene and block the operation when you try to modify the owner of a file - 
// In this case, an IOException will be thrown.


package p478_access_file_attributes;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.UserPrincipal;;

public class Test4 {

	public static void main(String[] args) {
		try {
			// Read owner of file
			Path path = Paths.get("c:/temp/Test.java");
			System.out.println(Files.getOwner(path).getName());
			
			// Change owner of file
			UserPrincipal owner = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("Juan");
			Files.setOwner(path, owner);
			
			//Output the updated owner information
			System.out.println(Files.getOwner(path).getName());
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
