// The syntax of the for loop : for(initialization; boolean_expression; update){}
// In every iteration, update statement is executed after loop body. Then boolean_expression will be evaluated 
// to see if it's true so loop body will be executed.

// It is important to not that, update statement can be any statement.
// So here for update part we used both increment and printing statement which is completely legal.


package Test2Q45_for_loop;

public class Program {

	public static void main(String[] args) {
		for(int x = 0; x < 5; System.out.print(x++));
	}
}

// 01234