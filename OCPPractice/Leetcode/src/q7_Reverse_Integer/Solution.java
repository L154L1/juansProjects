// 7. Reverse Integer

//Given a 32-bit signed integer, reverse digits of an integer.

//Example 1:
//Input: 123
//Output: 321

//Example 2:
//Input: -123
//Output: -321

//Example 3:
//Input: 120
//Output: 21

//Note:
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: −2,147,483,648 (−2^31) through 2,147,483,647 (2^31 − 1). For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


package q7_Reverse_Integer;

public class Solution {
	
	public int reverse(int x) {		
		int rev = 0;		
		while(x != 0) {									
			int pop = x % 10;			
			x /= 10;
			
			// Handle overflow
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) return 0;
			if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) return 0;
			
			rev = rev * 10 + pop;					
		}	
		return rev;        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.reverse(1534236469));

	}

}
