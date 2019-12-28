//443. String Compression

//Given an array of characters, compress it in-place.

//The length after compression must always be smaller than or equal to the original array.

//Every element of the array should be a character (not int) of length 1.

//After you are done modifying the input array in-place, return the new length of the array.

//Follow up:
//Could you solve it using only O(1) extra space?

//Example 1:
//Input:
//["a","a","b","b","c","c","c"]
//Output:
//Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//Explanation:
//"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".

//Example 2:
//Input:
//["a"]
//Output:
//Return 1, and the first 1 characters of the input array should be: ["a"]
//Explanation:
//Nothing is replaced.
 
//Example 3:
//Input:
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//Output:
//Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
//Explanation:
//Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
//Notice each digit has it's own entry in the array.
 
//Note:
//All characters have an ASCII value in [35, 126].
//1 <= len(chars) <= 1000.


//Algorithm
//Let's maintain anchor, the start position of the contiguous group of characters we are currently reading.
//Now, let's read from left to right. We know that we must be at the end of the block when we are at the last character of the array, or when the next character is different from the current character.
//When we are at the end of a group, we will write the result of that group down using our write head. chars[anchor] will be the correct character, and the length (if greater than 1) will be read - anchor + 1. We will write the digits of that number to the array.


// My score:
//Success
//Runtime: 1 ms, faster than 97.00% of Java online submissions for String Compression.
//Memory Usage: 37.8 MB, less than 6.82% of Java online submissions for String Compression.

package q443_String_Compression;

public class Solution {
	
	public int compress(char[] chars) {
		
		if(chars.length == 1) return 1;
		
		int anchor = 0, write = 0, read = 0, count = 1;
		
		for(read = 1; read < chars.length; read++) {
			if(chars[read] == chars[anchor]) count++;
			else {
				chars[write++] = chars[anchor];
				anchor = read;
				if(count > 1) {
					for(char c : (""+count).toCharArray()) chars[write++] = c;
				}				
				count = 1;
			}
			if(read == chars.length-1 ) {
				chars[write++] = chars[anchor];	
				if(count > 1)
					for(char c : (""+count).toCharArray()) chars[write++] = c;				
			}
		}
		return write;
		        
    }
	
	

	public static void main(String[] args) {
		Solution s = new Solution();
		
		char[] chars = {'a','a','b','b','c','c','c'};
		char[] chars2 = {'a','b','c'};
		
		System.out.println(s.compress(chars2));
		
		System.out.println(chars2);

	}

}
