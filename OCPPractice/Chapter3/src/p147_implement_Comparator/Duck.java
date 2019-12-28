package p147_implement_Comparator;

import java.util.*;

public class Duck implements Comparable<Duck> {
	
	private String name;
	private int weight;
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return name;
	}
	public int compareTo(Duck d) {
		return name.compareTo(d.name);	
	}
	
	public static void main(String[] args) {
		Comparator<Duck> byWeight = new Comparator<Duck>() {	// inner anonymous class implements Comparator interface
			public int compare(Duck d1, Duck d2) {
				return d1.weight - d2.weight;
			}
		};
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));
		
		Collections.sort(ducks);		
		System.out.println(ducks);		// [Puddles, Quack]
		
		Collections.sort(ducks, byWeight);	
		System.out.println(ducks);		// [Quack, Puddles]
		
		
		// because Comparator is functional interface (only one abstract method), above inner class implementation can use lambda equivalent
		Comparator<Duck> byWeight2 = (d1, d2) -> d1.weight - d2.weight;
		Collections.sort(ducks, byWeight2);	
		System.out.println(ducks);		// [Quack, Puddles]
		
	}

}
