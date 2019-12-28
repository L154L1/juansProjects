// 20. Valid Parentheses

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.

//Example 1:
//Input: "()"
//Output: true

//Example 2:
//Input: "()[]{}"
//Output: true

//Example 3:
//Input: "(]"
//Output: false

//Example 4:
//Input: "([)]"
//Output: false

//Example 5:
//Input: "{[]}"
//Output: true


//Algorithm:
//Initialize a stack S.
//Process each bracket of the expression one at a time.
//If we encounter an opening bracket, we simply push it onto the stack. This means we will process it later, let us simply move onto the sub-expression ahead.
//If we encounter a closing bracket, then we check the element on top of the stack. If the element at the top of the stack is an opening bracket of the same type, then we pop it off the stack and continue processing. Else, this implies an invalid expression.
//In the end, if we are left with a stack still having elements, then this implies an invalid expression.


// My score:
//Success
//Runtime: 1 ms, faster than 98.86% of Java online submissions for Valid Parentheses.
//Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Valid Parentheses.


package q20_Valid_Parentheses;

import java.util.ArrayDeque;

public class Solution {
	
	public boolean isValid(String s) {
		
		if(s.length() == 0) return true;
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			}
												
			if(s.charAt(i) == ')') {
				if(!stack.isEmpty() && stack.pop() == '(') continue;
				else return false;
			}
			if(s.charAt(i) == ']') {
				if(!stack.isEmpty() && stack.pop() == '[') continue;
				else return false;
			}
			if(s.charAt(i) == '}') {
				if(!stack.isEmpty() && stack.pop() == '{') continue;
				else return false;
			}						
		}
		
		if(stack.isEmpty()) return true;
		else return false;
        
    }
        

	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.isValid("()"));			
		System.out.println(s.isValid("()[]{}"));
		System.out.println(s.isValid("(]"));
		System.out.println(s.isValid("([)]"));
		System.out.println(s.isValid("{[]}"));
		
		System.out.println(s.isValid("(((((())))))"));
		System.out.println(s.isValid("(((((((()"));
		System.out.println(s.isValid("((()(())))"));

	}

}


//true
//true
//false
//false
//true
//true
//false
//true
