package p119_array;

public class P119 {
	
	public static void main(String[] args) {
		int[] numbers = new int[3];		// instantiating array like this will set each integer element to default integer value 0	
		for (int i = 0; i < 3; i++) {
			System.out.print(numbers[i] + " ");			// 0 0 0
		}
		System.out.println();
		
		int[] numbers2 = new int[] {42, 55, 99};		
		for (int i = 0; i < 3; i++) {
			System.out.print(numbers2[i] + " ");			// 42 55 99
		}
		System.out.println();
		
		int[] numbers3 = {42, 55, 99};		// shortcut for above initialization	
		for (int i = 0; i < 3; i++) {
			System.out.print(numbers3[i] + " ");			// 42 55 99
		}
		System.out.println();
		
		
		// [] can be before or after the variable name, add adding a space is optional
		int[] nums;
		int [] nums2;
		int nums3[];
		int nums4 [];
		
		
		int[] ids, types;		// creates two variables of type int[]
		int ids2[], types2;		// creates one variable of type int[] and one variable of type int
	}
}
