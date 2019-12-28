package decimalToBinary;

import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n, a;
        String x = "";
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();	// take user input and convert to a int number
        
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Integer.toHexString(n));
//        System.out.println(Integer.toOctalString(n));
        
        while(n > 0) {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        
        
        

	}
	
	
	

}
