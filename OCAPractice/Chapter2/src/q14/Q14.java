package q14;

public class Q14 {

	public static void main(String[] args) {
		int c = 7;
		int result = 4;
		result += ++c;
		System.out.println(result);		// 12
		
		int c2 = 7;
		int result2 = 4;
		result2 += c2++;
		System.out.println(result2);	// 11
	}
}
