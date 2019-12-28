package p254_overriding_vs_hiding_methods;

class Marsupial2 {
	public boolean isBiped() {
		return false;
	}
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}

class Kangaroo2 extends Marsupial2 {
	public boolean isBiped() {			// overridden method
		return true;
	}
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	public static void main(String[] args) {
		Kangaroo2 joey = new Kangaroo2();
		joey.getMarsupialDescription();			// Marsupial walks on two legs: true
		joey.getKangarooDescription();			// Kangaroo hops on two legs: true
	}
}
