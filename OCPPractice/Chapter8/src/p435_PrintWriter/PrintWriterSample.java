package p435_PrintWriter;

import java.io.*;

public class PrintWriterSample {

	public static void main(String[] args) throws IOException {
		File dest = new File("C:\\temp\\zoo.log");
		try(PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(dest)))){
			out.print("Today's weather is: ");
			out.println("Sunny");
			out.print("Today's temperature at the zoo is: ");
			out.print(1/3.0);
			out.println('C');
			out.format("It has rained 10.12 inches this year");
			out.println();
			out.printf("It may rain 21.2 more inches this year");
			
		}
	}
}
