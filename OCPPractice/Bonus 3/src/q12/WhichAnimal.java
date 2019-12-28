// Q. 12  	What is the result of the following code?

// The switch statement is not correct. The case must contain the type without the name of the enum. 
// case SQUIRREL would compile.


package q12;

public class WhichAnimal {
	
	enum AnimalsInPark {
		SQUIRREL, CHIPMUNK, SPARROW
		}

	public static void main(String[] args) {
		AnimalsInPark a = AnimalsInPark.CHIPMUNK ;
		switch (a) {
		case AnimalsInPark.SQUIRREL: System.out.print("S");
		case AnimalsInPark.CHIPMUNK : System.out.print("C");
		default: System.out.print("P");
		}

	}

}
