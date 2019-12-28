//Approach 1: Reduce to Single Word in B

//Intuition

//If b is a subset of a, then say a is a superset of b. 
	
// (word) is the count of the number of \text{"a"}"a"'s in the word.
//
//When we check whether a word wordA in A is a superset of wordB, we are individually checking the counts of letters: that for each letter, we have N_a >= N_b

//Now, if we check whether a word wordA is a superset of all words in B 
//we will check for each letter and each i, that N_a >= N_b max. 

//For example, when checking whether "warrior" is a superset of words B = ["wrr", "wa", "or"], we can combine these words in B to form a "maximum" word "arrow", that has the maximum count of every letter in each word in B.

//Algorithm

//Reduce B to a single word bmax as described above, then compare the counts of letters between words a in A, and bmax.

// Result:
//Success
//Runtime: 26 ms, faster than 58.11% of Java online submissions for Word Subsets.
//Memory Usage: 47.6 MB, less than 100.00% of Java online submissions for Word Subsets.

package q916_Word_Subsets;

import java.util.*;

public class Solution2 {
	
	public List<String> wordSubsets(String[] A, String[] B) {
		int[] bmax = count("");
		for(String b : B) {
			int[] bCount = count(b);
			for(int i=0; i<26; i++)
				bmax[i] = Math.max(bmax[i], bCount[i]);
		}
		List<String> list = new ArrayList<>();
		search: for(String a : A) {
			int[] aCount = count(a);
			for(int i=0; i<26; i++)
				if(aCount[i] < bmax[i]) continue search;
			list.add(a);
		}
		return list;
		
	}
	
	int[] count(String s) {
		int[] arr = new int[26];
		for(char c : s.toCharArray()) 
			arr[c-'a']++;
		return arr;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
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
