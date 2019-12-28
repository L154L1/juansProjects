package p172;

// When calling a method with vararg parameter, you can pass an array or you can list the elements and let java create array for you. 
// You can even omit the vararg values and java will create an array of length zero for you.
// It is possible to pass null as vararg value because array is reference type.

public class P172 {
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}
	public static void main(String[] args) {
		walk(1);					// 0
		walk(1, 2);					// 1
		walk(1, 2, 3);				// 2
		walk(1, new int[]{4, 5});	// 2
		
		run(11, 12);				// 12
		
		walk(1, null);				// throws NullPointerException because it tries to determine the length of null.			
	}
	
	public static void run(int... nums) {
		System.out.println(nums[1]);
	}
}
