package p243_call_constructors;

class Primate {
	public Primate() {
		System.out.println("Primate");
	}
}

class Ape extends Primate {
	public Ape() {		
		System.out.println("Ape");
	}
}

class Chimpanzee extends Ape {

	public static void main(String[] args) {
		new Chimpanzee();		// will print "Primate" then "Ape"
	}
}
