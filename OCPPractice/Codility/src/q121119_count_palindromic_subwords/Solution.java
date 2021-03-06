// Question: CountPalindromicSlices (LeetCode q5 Longest Palindromic Substring )
// Count the palindromic subwords of given string.
// Difficulty: hard


//In this problem we consider only strings consisting of lower-case English letters (a−z).

//A string is a palindrome if it reads exactly the same from left to right as it does from right to left. For example, these strings are palindromes:
//aza
//abba
//abacaba

//These strings are not palindromes:
//zaza
//abcd
//abacada

//Given a string S of length N, a slice of S is a substring of S specified by a pair of integers (p, q), such that 0 ≤ p < q < N. A slice (p, q) of string S is palindromic if the string consisting of letters S[p], S[p+1], ..., S[q] is a palindrome. For example, in a string S = abbacada:
//slice (0, 3) is palindromic because abba is a palindrome,
//slice (6, 7) is not palindromic because da is not a palindrome,
//slice (2, 5) is not palindromic because baca is not a palindrome,
//slice (1, 2) is palindromic because bb is a palindrome.

//Write a function
//class Solution { public int solution(String S); }
//that, given a string S of length N letters, returns the number of palindromic slices of S. The function should return −1 if this number is greater than 100,000,000.

//For example, for string S = baababa the function should return 6, because exactly six of its slices are palindromic; namely: (0, 3), (1, 2), (2, 4), (2, 6), (3, 5), (4, 6).

//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [0..20,000];
//string S consists only of lowercase letters (a−z).

// My score:
//Task Score
//50%
//Correctness
//100%
//Performance
//22%
//time complexity: O(N**2)

package q121119_count_palindromic_subwords;

public class Solution {
	
	public int solution(String S) {
		if(S.length() < 2) return 0;
		
		int count = 0;
        for(int i = 0; i < S.length(); i++) 
        	count += expandAroundCenter(S, i, i) + expandAroundCenter(S, i, i+1);
        	       	
       if(count <= 100000000) return count;
       else return -1;
    }
	
	int expandAroundCenter(String s, int L, int R) {
		int count = 0;
		while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			if(L != R) count++;
			L--;
			R++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
