// 5. Longest Palindromic Substring
// difficulty: Medium

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

//Example 1:
//Input: "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.

//Example 2:
//Input: "cbbd"
//Output: "bb"

//Approach 1: Brute Force

package q5_Longest_Palindromic_Substring;

public class Solution {
	
	public String longestPalindrome(String s) {
		
		int n = s.length();
		int maxLen = 0;
		String ans = n>0? s.substring(0, 1) : "";
				
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++) {
				if(s.charAt(i)==s.charAt(j) && j-i+1>maxLen ) {
					String sub = s.substring(i, j+1);
					StringBuilder sb = new StringBuilder(sub);
					if(sb.reverse().toString().equals(sub)) {
						maxLen = j-i+1;
						ans = sub;
					} 															
				}
			}
		
        return ans;
}

	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.longestPalindrome("babad"));
		System.out.println(s.longestPalindrome("cbbd"));
		System.out.println(s.longestPalindrome("a"));
		System.out.println(s.longestPalindrome("ac"));
		System.out.println(s.longestPalindrome("bb"));				
		System.out.println(s.longestPalindrome("abcda"));	
		System.out.println(s.longestPalindrome("aaabaaaa"));
		System.out.println(s.longestPalindrome("abbacccacccabdefg"));

	}

}
