// BinaryGap
// Find longest sequence of zeros in binary representation of an integer.

//A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

//For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

//Write a function:
//class Solution { public int solution(int N); }
//that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..2,147,483,647].


// My score: 
//Task Score
//100%
//Correctness
//100%


package lesson1_binary_gap;

public class Solution {
	
	public int solution(int N) {
		String s = Integer.toBinaryString(N);
		
		//Trim the leading 0's and tailing 0's if there are any.
		s = s.substring(s.indexOf("1"), s.lastIndexOf("1")+1);
		
		int count = 0, gap = 0;
		for(int i = 0; i < s.length(); i++) {
			if(i != 0 && i != s.length()-1 && s.charAt(i) == '0') {
				count++;				
				gap = Math.max(gap, count); 
			} else {
				count = 0;				
			}
		}
		
		return gap;
		
	}
	
		
	
	public static void main(String[] args) {
		Solution test = new Solution();
		
		System.out.println(test.solution(9));

		System.out.println(test.solution(529));
	
		System.out.println(test.solution(1041));
		
		System.out.println(test.solution(20));
		
		System.out.println(test.solution(32));
		
		System.out.println(test.solution(12));
		
		System.out.println(test.solution(15));
		
	}

}
