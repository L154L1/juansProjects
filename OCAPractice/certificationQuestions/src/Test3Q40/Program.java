// When using a primitive or reference type variables as case constants, we should keep in mind that they should be compile time constant.
// Here the variable i us final but it is not compile time as the value is assigned later.

package Test3Q40;

public class Program {

	public static void main(String[] args) {
		final int i;
		i = 1;
		final int y = 2;
		
		switch(2){
			case 0 : {System.out.print("A");}
			case i : System.out.print("B");
			default : System.out.print("default"); break;
			case y : System.out.print("C");
		}

	}

}
