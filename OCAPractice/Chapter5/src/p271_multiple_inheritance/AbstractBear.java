package p271_multiple_inheritance;

interface Herbivore2 {
	public void eatPlants();
}

interface Omnivore2 {
	public int eatPlants();
}

interface superVore extends Herbivore2, Omnivore2 {}

abstract class AbstractBear implements Herbivore2, Omnivore2  {}
