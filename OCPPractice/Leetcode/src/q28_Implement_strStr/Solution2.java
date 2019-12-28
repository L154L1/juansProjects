// My score:
//Success
//Runtime: 2 ms, faster than 53.78% of Java online submissions for Implement strStr().
//Memory Usage: 37.6 MB, less than 70.23% of Java online submissions for Implement strStr().

package q28_Implement_strStr;

public class Solution2 {
	
	public int strStr(String haystack, String needle) {
		if(needle.length() == 0) return 0;		
		if(needle.length() > haystack.length()) return -1;
		
		for(int i = 0; i < haystack.length(); i++) {
			int end = i + needle.length();
			if(end <= haystack.length() && haystack.substring(i, end).equals(needle)) return i; 
		}
		
		return -1;
	
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		System.out.println(s.strStr("hello", "ll"));
		System.out.println(s.strStr("aaaaa", "bba"));
		System.out.println(s.strStr("mississippi", "issip"));
		
		System.out.println(s.strStr("a", "a"));

	}

}
