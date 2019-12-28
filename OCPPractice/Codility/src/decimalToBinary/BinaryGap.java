//A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

//For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

//Write a function:
//class Solution { public int solution(int N); }
//that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..2,147,483,647].


package decimalToBinary;

import java.util.Scanner;
import java.util.*;

public class BinaryGap {

	public static void main(String[] args) {
		int n, a;
        String x = "";
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();	// take user input and convert to a int number
        
        while(n > 0) {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        
        int gapLength = 0;
        
        List<Integer> list = new ArrayList<>();
        if(x.startsWith("1")&& x.endsWith("1")) {
        	String y = x.substring(1, x.length()-1);
        	
        	System.out.println("y: " + y);
        	
        	int i = 0;        	
        	while(i < y.length()) {
        		int j = i;
        		int len = 0;
        		
        		while(j<y.length()&&y.charAt(j) =='0') {
        			System.out.println("charAt(j): " + y.charAt(j));
        			len += 1;
        			j++;
        			
        		}
        		list.add(len);
        		System.out.println("len: " + len);
        		i =+ j;
        		
        	}     	
        } 
        
        System.out.println("list size: " + list.size());
        
        if(list.size() > 0) 
        	gapLength = list.stream().mapToInt(num -> num).max().getAsInt();
        
        System.out.println("Largest binary gap: " + gapLength);

	}

}
