// Which two modifications enable the given code to compile? (Choose two.)
// A. Nest the USCurrency enumeration declaration within the Coin class.
// B. Make the USCurrency enumeration constructor private.
// C. Remove the new keyword from the instantion of usCoin.
// D. Make the getter method of value as a static method.
// E. Add the final keyword in the declaration of value.

// Answer: BC

package q27_enum;

enum USCurrency {
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	
	//public USCurrency(int value) {
	private USCurrency(int value) {		// Correction B
		this.value = value;
	}
	
	public int getValue() { return value; } 
}

public class Coin {

	public static void main(String[] args) {
		//USCurrency usCoin = new USCurrency.DIME;
		USCurrency usCoin = USCurrency.DIME;	// Correction C
		System.out.println(usCoin.getValue());

	}

}
