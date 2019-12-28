// Longest Substring Without Repeating Characters

//Example 1:
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 

//Example 2:
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.

//Example 3:
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3. 
// Note that the answer must be a substring, "pwke" is a subsequence and not a substring.



//Approach 1: Brute Force
//Intuition

//Check all the substring one by one to see if it has no duplicate character.

//Algorithm

//Suppose we have a function boolean allUnique(String substring) which will return true if the characters in the substring are all unique, otherwise false. We can iterate through all the possible substrings of the given string s and call the function allUnique. If it turns out to be true, then we update our answer of the maximum length of substring without duplicate characters.

//Now let's fill the missing parts:

//To enumerate all substrings of a given string, we enumerate the start and end indices of them. Suppose the start and end indices are ii and jj, respectively. Then we have 0 \leq i \lt j \leq n0≤i<j≤n (here end index jj is exclusive by convention). Thus, using two nested loops with ii from 0 to n - 1n−1 and jj from i+1i+1 to nn, we can enumerate all the substrings of s.

//To check if one string has duplicate characters, we can use a set. We iterate through all the characters in the string and put them into the set one by one. Before putting one character, we check if the set already contains it. If so, we return false. After the loop, we return true.


package q3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;

public class Solution {
	
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));		// 3
		System.out.println(s.lengthOfLongestSubstring("bbbbb"));		// 1
		System.out.println(s.lengthOfLongestSubstring("pwwkew"));		// 3
		System.out.println(s.lengthOfLongestSubstring(""));				// 0				
		System.out.println(s.lengthOfLongestSubstring("abceabcefbb"));	// 5		
		System.out.println(s.lengthOfLongestSubstring("au"));			// 2		
		System.out.println(s.lengthOfLongestSubstring("dvdf"));			// 3

	}

}
