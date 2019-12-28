// The loop starts at 0 and increments up to 127 then to -128 and increments up to 127 and repeats. 
// The loop runs forever.

package Test3Q19;

public class Program {

	public static void main(String[] args) {
		byte i = 0;
		for(;;){
			System.out.println(i++ + " "); // Infinite loop prints 0 to 127 and -128 to 0
		}

	}

}
