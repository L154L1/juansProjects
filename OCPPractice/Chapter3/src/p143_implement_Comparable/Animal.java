// Rules of compareTo return value :
// - 0 is returned when the current object is equal to the compared object (the argument to compareTo).
// - negative integer is returned when the current object is smaller than the compared object.
// - positive integer is returned when the current object is larger than the compared object.


package p143_implement_Comparable;

import java.util.*;
public class Animal implements Comparable<Animal> {
	
	private int id;
	public int compareTo(Animal a) {
		return id - a.id;
	}	

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		a1.id = 5;
		a2.id = 7;
		System.out.println(a1.compareTo(a2));	// -2
		System.out.println(a1.compareTo(a1));	// 0
		System.out.println(a2.compareTo(a1));	// 2

	}

}
