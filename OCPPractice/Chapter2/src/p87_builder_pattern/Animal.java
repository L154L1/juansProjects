// Builder pattern - is a creational pattern in which parameters are passed to a builder object, often through method chaining, and an object is generated with a final build call. 
// It's a solution to creation of object with large amount of properties.
// Builder class and its target class are tightly coupled.
// In practice, a builder class is often packaged alongside its target class, either as a static inner class within the target class or within the same java package.
// One advantage is that writer of the target class can then choose to make the constructor a private or default package, 
// forcing the user to rely on the builder object to obtain the instance of the target class.

package p87_builder_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {
	
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	
	private Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public String getSpecies() {
		return species;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getFavoriteFoodsCount(){ 
		return favoriteFoods.size();
	}
	
	public String getFavoriteFood(int index){ 
		return favoriteFoods.get(index);
	}
	
	//builder class (defined as a static inner class withing the target class)
	public static class AnimalBuilder{
		
		private String species;
		private int age;
		private List<String> favoriteFoods;
		
		public AnimalBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public AnimalBuilder setSpecies(String species) {
			this.species = species;
			return this;
		}
		
		public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
			this.favoriteFoods = favoriteFoods;
			return this;
		}
		
		public Animal build() {
			return new Animal(species, age, favoriteFoods);
		}
	}

	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder.setAge(4).setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");
		Animal duck = duckBuilder.build();
		
		Animal flamingo = new AnimalBuilder().setFavoriteFoods(Arrays.asList("algae", "insects")).setSpecies("flamingo").build();
		
		System.out.println(duck.getSpecies() + " " + duck.getAge());
		System.out.println(flamingo.getSpecies() + " " + flamingo.getAge());

	}

}
