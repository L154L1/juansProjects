// What is the result?
// A. 10123 Ford
//    10124 BMW
// B. 10124 BMW
//    10123 Ford
// C. A compilation error occurs.
// D. A ClassCastExceptionis thrown at run time.

// Answer: D

// Vehicle class should implement Comparable<Vehicle>

package q15_TreeSet;

import java.util.*;

public class Vehicle {
	
	int vno;
	String name;
	public Vehicle (int vno, String name) {
	this.vno = vno;
	this.name = name;
	}
	public String toString () {
	return vno + ":" + name;
	}

	public static void main(String[] args) {
		Set<Vehicle> vehicles = new TreeSet <> ();
		vehicles.add(new Vehicle (10123, "Ford"));
		vehicles.add(new Vehicle (10124, "BMW"));
		System.out.println(vehicles);

	}

}


// throws ClassCastException (Vehicle cannot be cast to java.lang.Comparable)