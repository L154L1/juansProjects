// 9. Palindrome Number

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

//Example 1:
//Input: 121
//Output: true

//Example 2:
//Input: -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

//Example 3:
//Input: 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


package q9_Palindrome_Number;

public class Solution {
	
	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		int rev = 0, n = x;
		while(n > 0) {		
			int pop = n % 10;
			n /= 10;
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7))
				return false;
			rev = rev * 10 + pop;
			
		}
		
		if(x == 0 || x == rev) return true;
		else return false;
        
    }
	

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPalindrome(121));
		System.out.println(s.isPalindrome(-121));
		System.out.println(s.isPalindrome(10));
	}

}
