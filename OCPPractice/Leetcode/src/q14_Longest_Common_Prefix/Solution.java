// 14. Longest Common Prefix

//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

//Example 1:
//Input: ["flower","flow","flight"]
//Output: "fl"

//Example 2:
//Input: ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

//Note:
//All given inputs are in lowercase letters a-z.

// My score:
//Success
//Runtime: 2 ms, faster than 16.26% of Java online submissions for Longest Common Prefix.
//Memory Usage: 38.2 MB, less than 80.12% of Java online submissions for Longest Common Prefix.


package q14_Longest_Common_Prefix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	
	public String longestCommonPrefix(String[] strs) {
		
		StringBuilder sb = new StringBuilder("");
		int arraylen = strs.length;
		
		if(arraylen == 0) return "";
		if(arraylen == 1) return strs[0];
		
		Comparator<String> c = (s1, s2) -> s1.length() - s2.length(); 		
		Arrays.sort(strs, c);
						
		OUTER: for(int i=0; i<strs[0].length(); i++) {		
			for(int j=0; j<arraylen-1; j++) {
				if(strs[j].charAt(i) != strs[j+1].charAt(i)) break OUTER;
			}
			sb.append(strs[0].charAt(i));			
		}
		
		return sb.toString();
	    
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		
		String[] test1 = {"flower","flow","flight"};
		String[] test2 = {"dog","racecar","car"};

		System.out.println(s.longestCommonPrefix(test1));
		System.out.println(s.longestCommonPrefix(test2));

	}

}
