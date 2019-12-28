// pre-increment/pre-decrement operator - the operator is applied first and the value return is the new value of the expression.
// post-increment/post-decrement oprator - the original value of the expression is returned, with operator applied after the value is returned.

package p58_increment_decrement_operators;

public class P59 {

	public static void main(String[] args) {
		int counter = 0;
		System.out.println(counter);	// 0
		System.out.println(++counter);	// 1
		System.out.println(counter);	// 1
		System.out.println(counter--);	// 1
		System.out.println(counter);	// 0
		
		System.out.println();
		
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);	// 2
		System.out.println("y is " + y);	// 7
	}
}
