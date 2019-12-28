package Codility3;

public class Solution {
	
	 public int solution(int A, int B, int K) {
		 
		 int res=0;
		 for(int i=A; i<=B; i++) {
			 if(i%K==0) res++;
		 }
		 		 
	     return res;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
