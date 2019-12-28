//925. Long Pressed Name (Google used in round 4 interview.)

//Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

//You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

//Example 1:
//Input: name = "alex", typed = "aaleex"
//Output: true
//Explanation: 'a' and 'e' in 'alex' were long pressed.

//Example 2:
//Input: name = "saeed", typed = "ssaaedd"
//Output: false
//Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.

//Example 3:
//Input: name = "leelee", typed = "lleeelee"
//Output: true

//Example 4:
//Input: name = "laiden", typed = "laiden"
//Output: true
//Explanation: It's not necessary to long press any character.

//Note:
//name.length <= 1000
//typed.length <= 1000
//The characters of name and typed are lowercase letters.

// My score:
//Success
//Runtime: 1 ms, faster than 55.72% of Java online submissions for Long Pressed Name.
//Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Long Pressed Name.



package q925_Long_Pressed_Name;

public class Solution {
	
	public boolean isLongPressedName(String name, String typed) {
		
		int i = 0, j = 0, cnt1 = 1, cnt2 = 0;
		
		for(; i < name.length(); i++) {
			while(j < typed.length() && name.charAt(i) == typed.charAt(j)) {
				j++;
				cnt2++;
			}
			while(i < name.length()-1 && name.charAt(i) == name.charAt(i+1)) {
				i++;
				cnt1++;
			}
			if(cnt2 >= cnt1) {
				cnt1 = 1;
				cnt2 = 0;
			} else return false;
		}
		
		if(i == name.length()) return true;
		else return false;
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.isLongPressedName("alex", "aaleex"));		//true
		System.out.println(s.isLongPressedName("saeed", "ssaaedd"));	//false
		System.out.println(s.isLongPressedName("leelee", "lleeelee"));	//true
		System.out.println(s.isLongPressedName("laiden", "laiden"));	//true

	}
}


