package q1252_Cells_with_Odd_Values_in_a_Matrix;

public class Solution2 {
	
	 public int oddCells(int n, int m, int[][] indices) {
	        boolean[] row = new boolean[n];
	        boolean[] col = new boolean[m];
	        for (int[] pair : indices) {
	            row[pair[0]] = !row[pair[0]];
	            col[pair[1]] = !col[pair[1]];
	        }
	        int rows = 0;
	        int cols = 0;
	        for (int i = 0; i < n; i++) {
	            if (row[i]) rows++;
	        }
	        for (int i = 0; i < m; i++) {
	            if (col[i]) cols++;
	        }
	        
	        return rows * m + cols * n - rows * cols * 2;
	    }

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		int n = 2;
		int m = 3;
		int[][] indices = {{0, 1}, {1, 1}};
		
		System.out.println(s.oddCells(n, m, indices));

	}

}
