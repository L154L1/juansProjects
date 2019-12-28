// Q. 18  	What is the result of this program?

// This code is fine in Java 8. In Java 7, it would have produced a compiler error on line 6 because numberOfPlayers is not final. 
// Since effectively final is good enough in Java 8, the code compiles.

package q18;

public class PokerHand {
	public void play() {
		int numberOfPlayers = 6;
		class Dealer {
			public void deal() {
				for (int i = 1; i <= numberOfPlayers; i++)
					System.out.print(i);
			}
		}
		Dealer dealer = new Dealer();
		dealer.deal();
		}

	public static void main(String[] args) {
		PokerHand hand = new PokerHand();
		hand.play();		// 123456

	}

}
