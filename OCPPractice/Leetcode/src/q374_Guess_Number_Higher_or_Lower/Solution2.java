//Approach 2: Using Binary Search
//Algorithm
//We can apply Binary Search to find the given number. We start with the mid number. We pass that number to the guessguess function. If it returns a -1, it implies that the guessed number is larger than the required one. Thus, we use Binary Search for numbers lower than itself. Similarly, if it returns a 1, we use Binary Search for numbers higher than itself.

// Result:
//Success
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
//Memory Usage: 32.9 MB, less than 100.00% of Java online submissions for Guess Number Higher or Lower.

package q374_Guess_Number_Higher_or_Lower;

public class Solution2 extends GuessGame {
	
	public int guessNumber(int n) {
        int left = 1, right = n;
        while(left <= right) {
        	int mid = left + (right-left) / 2;
        	int res = guess(mid);
        	if(res == 0) return mid;
        	if(res < 0) right = mid - 1;
        	if(res > 0) left = mid + 1;
        }
        
        return n;
    }

}
