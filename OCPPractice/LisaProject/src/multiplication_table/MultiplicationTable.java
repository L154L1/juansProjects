package multiplication_table;

import java.io.*;

public class MultiplicationTable {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How big do you want your multiplication table? (1-9)");
		int num = Integer.parseInt(br.readLine());		// user input
		table(num);

	}
	
	static void table(int num) {
		
		// print header and dottedline
		String columnheader = "\t";
		String dottedline = "";
		
		for(int i = 1; i < num + 1; i++) {
			columnheader += i + "\t";
			dottedline += "---------";
		}
		
		System.out.println(columnheader);
		System.out.println(dottedline);
		
		// print rows
		for (int i = 1; i < num + 1; i++) {
			System.out.print(i + " |\t");
			for(int j = 1; j < num + 1; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}
	
}
