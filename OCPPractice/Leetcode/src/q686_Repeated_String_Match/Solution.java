//686. Repeated String Match

//Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

//For example, with A = "abcd" and B = "cdabcdab".
//Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

//Note:
//The length of A and B will be between 1 and 10000.


//Approach #1: Ad-Hoc
//Intuition
//The question can be summarized as "What is the smallest k for which B is a substring of A * k?" We can just try every k.

//Algorithm
//Imagine we wrote S = A+A+A+.... If B is to be a substring of S, we only need to check whether some S[0:], S[1:], ..., S[len(A) - 1:] starts with B, as S is long enough to contain B, and S has period at most len(A).

//Now, suppose q is the least number for which len(B) <= len(A * q). We only need to check whether B is a substring of A * q or A * (q+1). If we try k < q, then B has larger length than A * q and therefore can't be a substring. When k = q+1, A * k is already big enough to try all positions for B; namely, A[i:i+len(B)] == B for i = 0, 1, ..., len(A) - 1.


// Result:
//Success
//Runtime: 96 ms, faster than 72.18% of Java online submissions for Repeated String Match.
//Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Repeated String Match.

package q686_Repeated_String_Match;

public class Solution {
	
	public int repeatedStringMatch(String A, String B) {		
		int q = 1;		
		StringBuilder sb = new StringBuilder(A);
		for(; sb.length() < B.length(); q++) sb.append(A);		
		if(sb.indexOf(B) >= 0) return q;
		if(sb.append(A).indexOf(B) >= 0) return q+1;		
		return -1;
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.repeatedStringMatch("abcd", "cdabcdab"));							//3
		System.out.println(s.repeatedStringMatch("a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));	//35

	}

}
