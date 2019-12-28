//Approach 2: Sliding Window

//Algorithm

//The naive approach is very straightforward. But it is too slow. So how can we optimize it?

//To check if a character is already in the substring, we can scan the substring, which leads to an O(n^2)O(n2) algorithm. But we can do better.

//By using HashSet as a sliding window, checking if a character in the current can be done in O(1)O(1).

//A sliding window is an abstract concept commonly used in array/string problems. A window is a range of elements in the array/string which usually defined by the start and end indices, i.e. [i, j)[i,j) (left-closed, right-open). A sliding window is a window "slides" its two boundaries to the certain direction. For example, if we slide [i, j)[i,j) to the right by 11 element, then it becomes [i+1, j+1)[i+1,j+1) (left-closed, right-open).

//Back to our problem. We use HashSet to store the characters in current window [i, j)[i,j) (j = ij=i initially). Then we slide the index jj to the right. If it is not in the HashSet, we slide jj further. Doing so until s[j] is already in the HashSet. At this point, we found the maximum size of substrings without duplicate characters start with index ii. If we do this for all ii, we get our answer.

package q3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;

public class Solution2 {
	
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while(i<n && j<n) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}
			else
				set.remove(s.charAt(i++));
		}		
		return ans;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));		// 3
		System.out.println(s.lengthOfLongestSubstring("bbbbb"));		// 1
		System.out.println(s.lengthOfLongestSubstring("pwwkew"));		// 3
		System.out.println(s.lengthOfLongestSubstring(""));				// 0				
		System.out.println(s.lengthOfLongestSubstring("abceabcefbb"));	// 5		
		System.out.println(s.lengthOfLongestSubstring("au"));			// 2		
		System.out.println(s.lengthOfLongestSubstring("dvdf"));			// 3

	}

}
