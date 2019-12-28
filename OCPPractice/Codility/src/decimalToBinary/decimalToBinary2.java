package decimalToBinary;

import java.util.Scanner;

public class decimalToBinary2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        int n = s.nextInt();	// take user input and convert to a int number
              
        System.out.println("Binary number:" + decToBin(n));

	}
	
	public static String decToBin(int x) {
		String bin = "";
		int p = largestPower(x);
		
		while(p > 0) {
			if(p <= x) {
				x = x - p;
				bin += "1";  	// same as bin = bin + "1";
			} else bin += "0";
			
			p = p / 2;
		}
				
		return bin;
	}
	
	public static int largestPower(int x) {
		int n = x, p = 1;

		while(n > 1) {
			n = n / 2;
			p = p * 2;
		}
				
		return p;
	}

} 
