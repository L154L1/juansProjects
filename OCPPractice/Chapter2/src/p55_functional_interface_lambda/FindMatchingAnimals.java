package p55_functional_interface_lambda;

import java.util.function.*;

class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
}


interface CheckTrait{
	public boolean test(Animal a);
}

public class FindMatchingAnimals {
	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal)) 
			System.out.println(animal);
	}
	
	// using our own interface CheckTrait is the same as using Java defined functional interface Predicate<T>
	private static void print2(Animal animal, Predicate<Animal> trait) {
		if(trait.test(animal)) 
			System.out.println(animal);
	}

	public static void main(String[] args) {
		print(new Animal("fish",false,true), a -> a.canHop());
		print(new Animal("kangaroo",true,false), a -> a.canHop());
		
		print2(new Animal("fish",false,true), a -> a.canHop());
		print2(new Animal("kangaroo",true,false), a -> a.canHop());
	}

}
