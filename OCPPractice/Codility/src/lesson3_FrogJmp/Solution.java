//FrogJmp - Count minimal number of jumps from position X to Y.

//A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
//Count the minimal number of jumps that the small frog must perform to reach its target.

//Write a function:
//class Solution { public int solution(int X, int Y, int D); }
//that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

//For example, given:
//  X = 10
//  Y = 85
//  D = 30
//the function should return 3, because the frog will be positioned as follows:

//after the first jump, at position 10 + 30 = 40
//after the second jump, at position 10 + 30 + 30 = 70
//after the third jump, at position 10 + 30 + 30 + 30 = 100
//Write an efficient algorithm for the following assumptions:

//X, Y and D are integers within the range [1..1,000,000,000];
//X ≤ Y.

// My score:
//Task Score
//100%
//Correctness
//100%
//Performance
//100%

package lesson3_FrogJmp;

public class Solution {
	
	public int solution(int X, int Y, int D) {
		if(D == 0) return 0;
		int d = Y - X;
		int n = d / D;
		int m = d % D;
		if(m != 0) return n+1;
		else return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
