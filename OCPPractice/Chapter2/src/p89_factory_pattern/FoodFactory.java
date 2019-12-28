// Factory pattern - is a creational pattern based on the idea of using a factory class to produce instances of objects based on a set of input parameters.
// The method to produce instance in the factory class is marked static.
// It's used in creating objects in which the precise type of the object may not be known till runtime. It's focused on supporting class polymorphism. 

package p89_factory_pattern;

public class FoodFactory {
	
	public static Food getFood(String animalName) {
		switch(animalName) {
			case "zebra": return new Hay(100);
			case "rabbit": return new Pellets(5);
			case "goat": return new Pellets(30);
			case "polar bear": return new Fish(10);
		}
		
		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}

}
