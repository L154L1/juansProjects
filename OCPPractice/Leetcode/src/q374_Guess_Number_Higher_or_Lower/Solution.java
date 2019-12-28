//374. Guess Number Higher or Lower

//We are playing the Guess Game. The game is as follows:

//I pick a number from 1 to n. You have to guess which number I picked.

//Every time you guess wrong, I'll tell you whether the number is higher or lower.

//You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

//-1 : My number is lower
// 1 : My number is higher
// 0 : Congrats! You got it!

//Example :
//Input: n = 10, pick = 6
//Output: 6

//Approach 1: Brute Force
//We check every number from 1 to n-1 and pass it to the guessguess function. The number for which a 0 is returned is the required answer.

// Result: Time limit exceeded

package q374_Guess_Number_Higher_or_Lower;

/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); */

class GuessGame {
	
	int guess(int num) { return 0; } // or return -1, 1
	
}

public class Solution extends GuessGame {
	public int guessNumber(int n) {
        for(int i=0; i<n; i++)
        	if(guess(i) == 0) return i;
        return n;
    }
	

}
