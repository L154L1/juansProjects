//Approach 1: Group into Blocks
//Intuition and Algorithm
//For a string like S = 'aabbbbccc', we can group it into blocks groupify(S) = [('a', 2), ('b', 4), ('c', 3)], that consist of a key 'abc' and a count [2, 4, 3].
//Then, the necessary and sufficient condition for typed to be a long-pressed version of name is that the keys are the same, and each entry of the count of typed is at least the entry for the count of name.

//For example, 'aaleex' is a long-pressed version of 'alex': because when considering the groups [('a', 2), ('l', 1), ('e', 2), ('x', 1)] and [('a', 1), ('l', 1), ('e', 1), ('x', 1)], they both have the key 'alex', and the count [2,1,2,1] is at least [1,1,1,1] when making an element-by-element comparison (2 >= 1, 1 >= 1, 2 >= 1, 1 >= 1).


// Result:
//Success
//Runtime: 1 ms, faster than 55.72% of Java online submissions for Long Pressed Name.
//Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Long Pressed Name.


package q925_Long_Pressed_Name;

import java.util.*;
public class Solution2 {
	
	public boolean isLongPressedName(String name, String typed) {
		
		Group group1 = groupify(name);
		Group group2 = groupify(typed);
		if(!group1.key.equals(group2.key)) return false;
		for(int i = 0; i < group1.count.size(); i++){
			if(group1.count.get(i) > group2.count.get(i)) return false;
		}
		return true;
	}
	
	Group groupify(String s) {
		StringBuilder sb = new StringBuilder();
		List<Integer> count = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			int cnt = 1;
			while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
				cnt++;
				i++;
			}
			count.add(cnt);
		}
		return new Group(sb.toString(), count);
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		System.out.println(s.isLongPressedName("alex", "aaleex"));		//true
		System.out.println(s.isLongPressedName("saeed", "ssaaedd"));	//false
		System.out.println(s.isLongPressedName("leelee", "lleeelee"));	//true
		System.out.println(s.isLongPressedName("laiden", "laiden"));	//true

	}

}

class Group {
	String key;
	List<Integer> count;
	Group(String key, List<Integer> count){
		this.key = key;
		this.count = count;
	}
	
}
