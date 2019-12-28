package q3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;

public class Solution3 {
	
	public int lengthOfLongestSubstring(String s) {
		
		int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
      
    }
	

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));		// 3
		System.out.println(s.lengthOfLongestSubstring("bbbbb"));		// 1
		System.out.println(s.lengthOfLongestSubstring("pwwkew"));		// 3
		System.out.println(s.lengthOfLongestSubstring(""));				// 0				
		System.out.println(s.lengthOfLongestSubstring("abceabcefbb"));	// 5		
		System.out.println(s.lengthOfLongestSubstring("au"));			// 2		
		System.out.println(s.lengthOfLongestSubstring("dvdf"));			// 3

	}

}
