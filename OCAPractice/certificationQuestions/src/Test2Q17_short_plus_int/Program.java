// When we try to add int to short, the result is int, trying to assign it to short causes compilation error.


package Test2Q17_short_plus_int;

public class Program {

	public static void main(String[] args) {
		short x = 2;
		x++;
//		x += 1;		// compiles
//		x = x + 1;	// does not compile
		
		short y = 3 + x++;
		System.out.print(y);

	}

}
