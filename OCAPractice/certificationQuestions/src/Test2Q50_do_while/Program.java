// It is a common mistake that missing the semicolon when using do while loop.

package Test2Q50_do_while;

public class Program {

	public static void main(String[] args) {
		int i = 10;
		do{
			i++;
			System.out.println(i);
		}while(i-- > 10)	// does not compile because of missing semicolon
		//	while(i-- > 10);	// compiles and print 11 infinitely
	}
}
