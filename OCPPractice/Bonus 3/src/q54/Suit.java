// Q. 54  	Which are true about the following code? (Choose all that apply.)
// Answer -
// A.	The Suit enum compiles successfully.
// C.	The constructor on line c1 cannot be changed to public or protected.

// An enum can contain other Java code including other enums with any access modifier. Enum constructors are only allowed to be private because they cannot be created by callers. They must be referred to like constants. 
// Since Color is an enum, the types must be referenced using their enum name.

package q54;

public enum Suit {
	
	SPADE(Color.BLACK), HEART(Color.RED), DIAMOND(Color.RED), CLUB(Color.BLACK);
	private enum Color { RED, BLACK; }
	private Suit(Color c) { color = c; }	//c1  	only private is allowed for enum constructor
	public Color color;

}
