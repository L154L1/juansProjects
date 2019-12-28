//1266. Minimum Time Visiting All Points

//On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.

//You can move according to the next rules:
//In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
//You have to visit the points in the same order as they appear in the array.

//Example 1: (graph - see screenshot file)	

//Input: points = [[1,1],[3,4],[-1,0]]
//Output: 7
//Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
//			Time from [1,1] to [3,4] = 3 seconds 
//			Time from [3,4] to [-1,0] = 4 seconds
//			Total time = 7 seconds

//Example 2:
//Input: points = [[3,2],[-2,2]]
//Output: 5

//Constraints:
//points.length == n
//1 <= n <= 100
//points[i].length == 2
//-1000 <= points[i][0], points[i][1] <= 1000

// Result:
//Success
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Time Visiting All Points.
//Memory Usage: 42.8 MB, less than 100.00% of Java online submissions for Minimum Time Visiting All Points.

package q1266_Minimum_Time_Visiting_All_Points;

public class Solution {
	
	 public int minTimeToVisitAllPoints(int[][] points) {
		 if(points.length < 2) return 0;
		 		 
		 int time = 0;
		 int[] start = points[0];
		 for(int i = 1; i < points.length ; i++) {
			 time += callTime(start, points[i]);
			 start = points[i];			 
		 }
	      
		 return time;
	 }
	 
	 int callTime(int[] start, int[] end) {
		 
		 int xdiff = Math.abs(start[0] - end[0]);
		 int ydiff = Math.abs(start[1] - end[1]);
		 int diagonal = Math.min(xdiff, ydiff);
		 int otherMove = Math.abs(xdiff - ydiff);
		 return diagonal + otherMove;
		 
	 }

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[][] points = {{1,1},{3,4},{-1,0}};
		
		System.out.println(s.minTimeToVisitAllPoints(points));

	}

}
