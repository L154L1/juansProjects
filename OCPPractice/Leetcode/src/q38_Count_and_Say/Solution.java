//38. Count and Say

//The count-and-say sequence is the sequence of integers with the first five terms as following:

//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.

//Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.

//Note: Each term of the sequence of integers will be represented as a string.

//Example 1:
//Input: 1
//Output: "1"
//Explanation: This is the base case.

//Example 2:
//Input: 4
//Output: "1211"
//Explanation: For n = 3 the term was "21" in which we have two groups "2" and "1", "2" can be read as "12" which means frequency = 1 and value = 2, the same way "1" is read as "11", so the answer is the concatenation of "12" and "11" which is "1211".

// Approach: Java recursion solution

// Result:
//Success
//Runtime: 1 ms, faster than 99.65% of Java online submissions for Count and Say.
//Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Count and Say.

package q38_Count_and_Say;

public class Solution {
	
	public String countAndSay(int n) {
		
		/*Base case*/
		if(n == 1) return "1";
		
		/*Input n countAndSay n-1.*/
		String s = countAndSay(n-1);
		
		StringBuilder sb = new StringBuilder();
		char c = s.charAt(0);
		int count = 1;
		for(int i = 1; i < s.length(); i++) {
			if(c == s.charAt(i)) {
				count++;
			} else {
				sb.append(count).append(c);
				c = s.charAt(i);
				count = 1;
			}
		}
		
		/*Append last char charAt(length-1) if it's different than the charAt(lengh-2).*/
		if(count > 0) sb.append(count).append(c);  
		
		return sb.toString();
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.countAndSay(4));
		System.out.println(s.countAndSay(5));
		System.out.println(s.countAndSay(6));

	}

}
