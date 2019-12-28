package Codility4;

import java.util.*;

public class Solution {
	
	public int solution(int[] A) {
		int ret = -1;
		
		int n = A.length;
		int[] B = A;
		Arrays.sort(A);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i= 0; i<n; i++) {
			int j=0;
			while(i<n-1&&A[i]==A[i+1]) {
				i++;
				j++;
			}
			map.put(i, j);
		}
		
		for(int k : map.keySet()) {
			if(map.get(k)> n/2) ret = k;
		}
			
		
        return ret;
    }

	public static void main(String[] args) {
		int[] a = {3, 4, 3, 2, 3, -1, 3, 3};
		
		System.out.println(new Solution().solution(a));

	}

}
