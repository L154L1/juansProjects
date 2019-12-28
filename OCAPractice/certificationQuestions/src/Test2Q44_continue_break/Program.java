// When using continue or break, we need to make sure that there are no statements to execute after them,
// if there then compiler has now way to reach them.

package Test2Q44_continue_break;

public class Program {

	public static void main(String[] args) {
		int y = 0;
		while(y--<10){continue;y+=2;}
		String message = y>10?"Greater than":"Less than";
		System.out.println(message + " 10");
				
	}
}
