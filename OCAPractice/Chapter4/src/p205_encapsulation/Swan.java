// Encapsulation refers to preventing callers from changing instance variables directly.

package p205_encapsulation;

public class Swan {
	private int numberEggs;							// make instance variable private
	
	public int getNumberEggs() {					// getter
		return numberEggs;
	}
	
	public void setNumberEggs(int numberEggs) {		// setter
		if (numberEggs >= 0)					// guard condition
			this.numberEggs = numberEggs;
	}
}
