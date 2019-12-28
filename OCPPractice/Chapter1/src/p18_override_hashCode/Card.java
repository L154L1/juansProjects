/*	hashCode() rules :
- Within the same program, the result of hashCode() should not change which means you should not include variables that will change.
for example, including the name is fine. Including weight is not good because weight could change regularly.
- If equals() return true when called with two objects, calling hashCode() on each of them must return the same result.
This means hashCode() can use a subset of the variables that equals() uses.
- If equals() return false when called with two objects, calling hashCode() on each of them does not have to return a different result.
This means hashCode() results do not have to be unique when called on unique objects.

*/

package p18_override_hashCode;

public class Card {
	
	private String rank;
	private String suit;
	public Card(String r, String s) {
		if (r == null || s == null) throw new IllegalArgumentException();
		rank = r;
		suit = s;		
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) return false;
		Card c = (Card)obj;
		return rank.equals(c.rank) && suit.equals(c.suit);
	}
	
	public int hashCode() {
		return rank.hashCode();
	}
}
