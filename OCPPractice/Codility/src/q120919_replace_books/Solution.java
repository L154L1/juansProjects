//ReplacingBooks
//Given a list of integers, return the maximum number of consecutive integers equal to each other after replacing at most K of them.


//There are N obligatory books in a school program syllabus. The program also defines the order in which books should be read. Each book comes from a specific age, such as the enlightenment or the baroque period. The more books in a row the students read from any given age, the more they learn about it. Moreover, if they read a book from a different age, they will get distracted.

//Teachers are allowed to replace K books from the program with alternatives. They want students to learn as much as possible from a single age (although they have not picked a particular specific age). The amount learned can be measured by the number of consecutive books from the same age read by the students. What is the maximum number of consecutive books from the same age after replacing at most K of them?

//Note that the new books (after replacement) can be any books from the chosen age. They do not need to be listed in the syllabus, so the teacher can always find K books from the same age.

//Write a function:

//class Solution { public int solution(int[] A, int K); }
//that, given an array of integers A of length N, representing the ages of consecutive books from the school program syllabus, and an integer K, returns the maximum number of consecutive books from the same age after replacing at most K of them.

//Examples:

//1. Given A = [1, 1, 3, 4, 3, 3, 4] and K = 2, the function should return 5. Teachers can replace books from age 4 with books from age 3.

//2. Given A = [4, 5, 5, 4, 2, 2, 4] and K = 0, the function should return 2. Teachers are not allowed to replace any books.

//3. Given A = [1, 3, 3, 2] and K = 2, the function should return 4. Teachers can replace all the books from other ages with books from age 3.

//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..100,000];
//K is an integer within the range [0..N];
//each element of array A is an integer within the range [1..100,000].

// My score:
//Task Score
//30%
//Correctness
//35%
//Performance
//25%


package q120919_replace_books;

public class Solution {
	
	public int solution(int[] A, int K) {
		
		if(A.length == 1) return 1;
		
        int current = A[0], age = 0;
        int cnt = 1, cntMax = 1, start = 0, end = 0;
        
        for(int i = 1; i < A.length; i++) {
        	if(A[i] == current) {
        		cnt++;
        	} else {   // end of a block
        		if(cnt >= cntMax) {
        			cntMax = cnt;
        			end = i;		  // exclusive
            		start = i - cnt;  // inclusive
            		age = current;
        		}    		       		        		       		
        				
        		cnt = 1;
        		current = A[i];        		
        	}
        	if(cnt == A.length) {
        		cntMax = cnt;
        		age = A[0];
        		end = A.length;
        	}
        }
        
        int replacement = 0;
        for(int j = start-1; j >= 0; j--) {
			if(A[j] != age && replacement < K) replacement++; 
			else if(replacement < K) cntMax++;
			else if(A[j] == age) cntMax++;
			else break;
		}

		for(int j = end; j < A.length; j++) {
			if(A[j] != age && replacement < K) replacement++; 
			else if(replacement < K) cntMax++;
			else if(A[j] == age) cntMax++;
			else break;
		}
        
        return cntMax + replacement;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] A = {4, 5, 5, 4, 2, 2, 4};			// output: 2
		int K = 0;
		
		int[] A2 = {1, 3, 3, 2};						// output: 4
		int K2 = 2;
		
		int[] A3 = {1, 1, 3, 4, 3, 3, 4};			// output: 5
		int K3 = 2;
				
		int[] A4 = {1, 1, 1, 1, 1, 1, 1};			// output: 7
		int K4 = 2;
		
		System.out.println(s.solution(A, K));
		System.out.println(s.solution(A2, K2));
		System.out.println(s.solution(A3, K3));		
		System.out.println(s.solution(A4, K4));

	}

}
