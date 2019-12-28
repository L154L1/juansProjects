// The check method accepts only short variable but here tries to pass an int value.

package Test4Q20;

public class Program {

	public static void main(String[] args) {
		System.out.print(new Program().check(10));	// does not compile
		
		System.out.print(new Program().check((short)10));
		
		short s = 10;	// this compiles

	}
	boolean check(short x){
		if(x<10) return true;
		else return false;
	}

}
