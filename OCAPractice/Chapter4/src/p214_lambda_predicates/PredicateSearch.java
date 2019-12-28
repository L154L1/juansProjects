package p214_lambda_predicates;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("bunny", true, false));
		
		print(animals, a -> a.canHop());	// bunny

	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if(checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() { return canHop; } 
	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
}
