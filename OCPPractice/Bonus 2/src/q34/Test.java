// Q. 34  	What is the result of the following code when run using the command java -ea PickAColor?

// Answer : red blue

//Enums use the unqualified name in the case statements

package q34;

public class Test {

	enum Color { RED, BLUE, GREEN}
	public static void go(Color c) {
	switch (c) {
	case RED: System.out.println("red");
	case BLUE: System.out.println("blue"); break;
	case GREEN: System.out.println("green");
	default: assert false;
	}
	}
	public static void main(String[] args) {
	go(Color.RED);
	}

}
