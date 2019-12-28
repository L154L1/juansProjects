package p478_access_file_attributes;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Test6_BasicFileAttributeViewSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/temp/Test.java");
		
		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes data = view.readAttributes();
			
		FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis()+1000_000);
				
		view.setTimes(lastModifiedTime, null, null);

		
	}

}
