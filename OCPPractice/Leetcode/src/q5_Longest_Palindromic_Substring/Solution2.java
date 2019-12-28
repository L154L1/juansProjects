// Approach 2: Expand Around Center

//In fact, we could solve it in O(n^2) time using only constant space.

//We observe that a palindrome mirrors around its center. Therefore, a palindrome can be expanded from its center, and there are only 2n - 1 such centers.

//You might be asking why there are 2n - 1  but not n centers? The reason is the center of a palindrome can be in between two letters. Such palindromes have even number of letters (such as "abba") and its center are between the two 'b's.

package q5_Longest_Palindromic_Substring;

public class Solution2 {
	
	public String longestPalindrome(String s) {
		if(s == null || s.length() < 1) return "";
		int start = 0, end = 0;
		for(int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if(len > end - start) {			// It means greater than or equal to previous length. Previous length should be end - start + 1. "if(len > end - start +1) { " means greater than previous length, which also works.
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		
		return s.substring(start, end + 1);
	}
	
	private int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}		
		return R - L - 1;	// palindromic substring length (R-1)-(L+1)+1 
	}
	

	public static void main(String[] args) {
		Solution2 s = new Solution2();
				
		System.out.println(s.longestPalindrome("babad"));
		System.out.println(s.longestPalindrome("cbbd"));
		System.out.println(s.longestPalindrome("a"));
		System.out.println(s.longestPalindrome("ac"));
		System.out.println(s.longestPalindrome("bb"));				
		System.out.println(s.longestPalindrome("abcda"));	
		System.out.println(s.longestPalindrome("aaabaaaa"));
		
		System.out.println(s.longestPalindrome("aacbcaaa"));
		System.out.println(s.longestPalindrome("aacbbcaaaa"));

	}

}
