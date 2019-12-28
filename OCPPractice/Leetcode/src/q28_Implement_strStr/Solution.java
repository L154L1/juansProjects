//28. Implement strStr()

//Implement strStr().
//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

//Example 1:

//Input: haystack = "hello", needle = "ll"
//Output: 2

//Example 2:
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1

//Clarification:
//What should we return when needle is an empty string? This is a great question to ask during an interview.
//For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

// My score:
//Success
//Runtime: 546 ms, faster than 5.08% of Java online submissions for Implement strStr().
//Memory Usage: 37.4 MB, less than 83.21% of Java online submissions for Implement strStr().

package q28_Implement_strStr;

public class Solution {
	
	public int strStr(String haystack, String needle) {
		
		//return haystack.indexOf(needle);		// Java indexof() is working but we need to implement it instead of using it for this problem.
		
		///* Implement Java indexof()
		if(needle.length() == 0) return 0;		
		if(needle.length() > haystack.length()) return -1;
		
		int index = -1;
		int i = 0, j = 0, count = 0;
		
		while(i < haystack.length()) {			
			while(i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
				count += 1;
				i++;
				j++;
//				System.out.println("count :" + count);
//				System.out.println("i :" + i);
			} 
			
			if(count == needle.length()) return index = i - count;
			else {
				i = i - count + 1;
				j = 0;
				count = 0;
			}			
		}
		
		return index;
		        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.strStr("hello", "ll"));
		System.out.println(s.strStr("aaaaa", "bba"));
		System.out.println(s.strStr("mississippi", "issip"));
		System.out.println(s.strStr("a", "a"));
	}

}
