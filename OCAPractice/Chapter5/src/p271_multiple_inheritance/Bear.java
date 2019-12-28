// A class implements two interfaces that contain the same abstract methods.
// if same signature, implementing one will automatically implement the another. The interface methods are considered duplicate.

package p271_multiple_inheritance;

interface Herbivore {
	public void eatPlants();
}

interface Omnivore {
	public void eatPlants();
	public void eatMeat();
}

class Bear implements Herbivore, Omnivore {
	public void eatPlants() {
		System.out.println("Eating plants");
	}
	public void eatMeat() {
		System.out.println("Eating meat");
	}
}
