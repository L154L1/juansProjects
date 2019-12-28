//1252. Cells with Odd Values in a Matrix

//Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

//Return the number of cells with odd values in the matrix after applying the increment to all indices.

//Example 1:
//0 0 0		1 2 1		1 3 1
//		->			->
//0 0 0		0 1 0		1 3 1

//Input: n = 2, m = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.

//Example 2:
//0 0		0 1		2 2
//		->		->
//0 0		1 2		2 2

//Input: n = 2, m = 2, indices = [[1,1],[0,0]]
//Output: 0
//Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final matrix.

//Constraints:
//1 <= n <= 50
//1 <= m <= 50
//1 <= indices.length <= 100
//0 <= indices[i][0] < n
//0 <= indices[i][1] < m

// My score:
//Success
//Runtime: 2 ms, faster than 46.04% of Java online submissions for Cells with Odd Values in a Matrix.
//Memory Usage: 40.2 MB, less than 100.00% of Java online submissions for Cells with Odd Values in a Matrix.


package q1252_Cells_with_Odd_Values_in_a_Matrix;

public class Solution {
	
	public int oddCells(int n, int m, int[][] indices) {
		/*The edge case*/
		if(m == 1 && n == 1) return 0;
		
        int[][] matrix = new int[n][m];
        int count = 0;
        
        /*First increment cells by all ri's from the indices */
        for(int i = 0; i < indices.length; i++) {
        	int row = indices[i][0];        	
        	for(int j = 0; j < m; j++)
        		if(row <= n) {
        			int prev = matrix[row][j];
        			matrix[row][j]++;
        			if(prev % 2 == 0) count++;
        			if(prev % 2 == 1) count--;
        		}
        }       
        
        /*Then increment cells by all ci's from the indices */
        for(int i = 0; i < indices.length; i++) {
        	int column = indices[i][1];
        	for(int j = 0; j < n; j++)
        		if(column <= m) {
        			int prev = matrix[j][column]; 
        			matrix[j][column]++;
        			if(prev % 2 == 0) count++;
        			if(prev % 2 == 1) count--;
        		}
        }
        return count;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int n = 2;
		int m = 3;
		int[][] indices = {{0, 1}, {1, 1}};
		
		System.out.println(s.oddCells(n, m, indices));

	}

}
