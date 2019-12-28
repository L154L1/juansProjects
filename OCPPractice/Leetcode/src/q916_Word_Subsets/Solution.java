//916. Word Subsets
//Difficulty: Medium

//We are given two arrays A and B of words.  Each word is a string of lowercase letters.

//Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", but is not a subset of "world".

//Now say a word a from A is universal if for every b in B, b is a subset of a. 

//Return a list of all universal words in A.  You can return the words in any order.

//Example 1:
//Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
//Output: ["facebook","google","leetcode"]

//Example 2:
//Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["l","e"]
//Output: ["apple","google","leetcode"]

//Example 3:
//Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","oo"]
//Output: ["facebook","google"]

//Example 4:
//Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["lo","eo"]
//Output: ["google","leetcode"]

//Example 5:
//Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["ec","oc","ceo"]
//Output: ["facebook","leetcode"]

//Note:
//1 <= A.length, B.length <= 10000
//1 <= A[i].length, B[i].length <= 10
//A[i] and B[i] consist only of lowercase letters.
//All words in A[i] are unique: there isn't i != j with A[i] == A[j].


// My score:
//Time Limit Exceeded

package q916_Word_Subsets;

import java.util.*;

public class Solution {
	
	public List<String> wordSubsets(String[] A, String[] B) {
		List<String> list = new ArrayList<>();
		for(String a : A) {
			int count = 0;
			for(String b : B)
				if(isSubset(a, b)) count++;
			if(count == B.length) list.add(a);
		}		
		return list;       
    }
	
	// is b subset of a ?
	boolean isSubset(String a, String b) {
		Group grpA = groupify(a);
		Group grpB = groupify(b);		
		for(int i=0; i<grpB.key.length(); i++) {
			int idx = grpA.key.indexOf(grpB.key.charAt(i));
			if(idx == -1) return false;
			if(grpB.count.get(i) > grpA.count.get(idx)) return false;
		}
		return true;
	}
	
	Group groupify(String s) {
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			int count = 1;
			while(i<arr.length-1 && arr[i] == arr[i+1]) {
				count++;
				i++;
			}
			list.add(count);
		}
		
		return new Group(sb.toString(), list);
	}
	
	static class Group {
		String key;
		List<Integer> count;
		Group(String key, List<Integer> count){
			this.key = key;
			this.count = count;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] A1 = {"amazon","apple","facebook","google","leetcode"};
		String[] B1 = {"e","o"};
		
		String[] A2 = {"amazon","apple","facebook","google","leetcode"};
		String[] B2 = {"e","oo"};
		
		String[] A3 = {"amazon","apple","facebook","google","leetcode"};
		String[] B3 = {"lo","eo"};

		
		System.out.println(s.wordSubsets(A1, B1));
		
		System.out.println(s.wordSubsets(A2, B2));
		
		System.out.println(s.wordSubsets(A3, B3));			
		
	}

}
