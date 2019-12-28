// The syntax of the for loop : for(initialization; boolean_expression; update){}
// In every iteration, update statement is executed after loop body. Then boolean_expression will be evaluated 
// to see if it's true so loop body will be executed.

// It is important to not that, update statement can be any statement. So in below code we have put the printing statement there, 
// and inside the loop body we increment the variable x.

package Test2Q48_for_loop;

public class Program {

	public static void main(String[] args) {
		for(int x = 0; x<10; System.out.print(x))
			x++;
	}
}

// 12345678910