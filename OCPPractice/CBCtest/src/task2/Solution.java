// Task: return an array containing N unique integers that sum up to 0. The function can return any such array.

package task2;

import java.util.*;

public class Solution {
	
	// my code in CBD test (incorrect)
	public int[] solution(int N) {
        int[] arr = new int[N];

        int sum = 0;
        for(int i=0; i<N; i++) 
        	sum += arr[i];       
        
        long count = Arrays.asList(arr).stream().distinct().count();
        
        
        try {
        	if(count == N && sum == 0) return arr;
            else throw new Exception("This is not the required array!"); 
        	
        } catch(Exception e) {
        	System.out.println(e.getMessage());
        }
             
        return arr;
    }

	
// Correct solution:
	public int[] solution2(int N) {
        int[] arr = new int[N];

        while(true) {
        	
        	for(int i=0; i<N; i++) {
            	arr[i] = random();
            }
        	
        	int sum = 0;
            for(int i=0; i<N; i++) 
            	sum += arr[i]; 
            
            Integer[] arr2 = new Integer[N];
            for(int i=0; i<N; i++) {
            	arr2[i] = arr[i];
            
            long count = Arrays.asList(arr2).stream().distinct().count();
            
            if(count == N && sum == 0) return arr;
        	
            }
        }

    }
	
	// return random integer between min and max.
	static int random() {
		int min = -100, max = 100;
		int diff = max - min;
		Random rn = new Random();
		int i = rn.nextInt(diff + 1);
		i += min;
		return i;
	}
	
	public static void main(String[] args) {
		int[] arr = new Solution().solution2(5);
		
		List<Integer> list = new ArrayList<>();
		for(int i : arr) list.add(i);
		
		System.out.println(list);
		
	}

}
