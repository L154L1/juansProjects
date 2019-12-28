package palindrome_recursive;

public class Solution {
	
	public boolean isPalindrome(String s) {
		if(s == null) return false;
		
		s = s.replace(" ", "");
		int n = s.length();
		if(n < 2) return true;
		if(s.charAt(0) != s.charAt(n-1)) return false;
		else return isPalindrome(s.substring(1, n-1));
		
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String s = "race car";
		
		System.out.println(solution.isPalindrome(s));

	}

}
