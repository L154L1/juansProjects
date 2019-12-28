// Below tries to define a immutable class. But it's actually mutable because in the getter method, a mutable object is referenced directly.
// although the list object cannot be reassigned but its content can be modified through the reference to the list

package p83_immutable_objects;

import java.util.*;

public final class Animal {
	
	private final List<String> favoriteFoods;
	
	public Animal(List<String> favoriteFoods) {
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = favoriteFoods;
	}
	
	public List<String> getFavoriteFoods(){  // makes class mutable !
		return favoriteFoods;
	}

}
