package Test3Q49;

interface I{}
abstract class Ab{}
class Sub extends Ab implements I {}

public class Program {

	public static void main(String[] args) {
		I i = new Sub();
		Ab ab = new Sub();
		
		boolean t1 = i instanceof I, t2 = ab instanceof Sub;
		System.out.println(t1 + " " + t2);	//true true
		
		System.out.println(i instanceof Sub);
		System.out.println(ab instanceof Ab);
	}

}
