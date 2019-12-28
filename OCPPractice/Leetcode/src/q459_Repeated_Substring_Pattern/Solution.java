//459. Repeated Substring Pattern

//Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

//Example 1:
//Input: "abab"
//Output: True
//Explanation: It's the substring "ab" twice.

//Example 2:
//Input: "aba"
//Output: False

//Example 3:
//Input: "abcabcabcabc"
//Output: True
//Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)

// Result:
//Success 
//Runtime: 15 ms, faster than 74.17% of Java online submissions for Repeated Substring Pattern.
//Memory Usage: 38.8 MB, less than 71.43% of Java online submissions for Repeated Substring Pattern.

package q459_Repeated_Substring_Pattern;

public class Solution {
	
	public boolean repeatedSubstringPattern(String s) {
		
		int high = s.length() / 2;				// largest possible substring length is half of the given string.
		for (int i = high; i > 0; i--) {		// every iteration the size of substring decrements by 1.
			if(s.length() % i == 0) {
				String sub = s.substring(0, i);		
				StringBuilder sb = new StringBuilder(sub);
				int m = s.length() / i;
				for(int j = 0; j < m - 1; j++)	// chain all the repeated subs together
					sb.append(sub);
				if(sb.toString().equals(s)) return true;
			}
			
			
		}
		
		return false;
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.repeatedSubstringPattern("abcabcabcabc"));
		System.out.println(s.repeatedSubstringPattern("abcabcabc"));
		System.out.println(s.repeatedSubstringPattern("abab"));
		System.out.println(s.repeatedSubstringPattern("aba"));
	}

}
