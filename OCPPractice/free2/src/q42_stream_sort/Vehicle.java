// Which two code fragments, when inserted at line n1 independently, enable the code to print TruckCarBike?
// A. .sorted ((v1, v2) -> v1.getVId() < v2.getVId())
// B. .sorted (Comparable.comparing (Vehicle: :getVName)).reversed ()
// C. .map (v -> v.getVid())
//    .sorted ()
// D. .sorted((v1, v2) -> Integer.compare(v1.getVId(), v2.getVid()))
// E. .sorted(Comparator.comparing ((Vehicle v) -> v.getVId()))

// Correct Answer: D E

package q42_stream_sort;

import java.util.*;

public class Vehicle {
	
	int vId;
	String vName;
	public Vehicle(int vIdArg, String vNameArg) {
		this.vId = vIdArg;
		this.vName = vNameArg;
	}
	public int getVId() { return vId; } 
	public String getVName() { return vName; }
	public String toString() { return vName; }

	public static void main(String[] args) {
		List<Vehicle> vehicle = Arrays.asList(
				new Vehicle(2, "Car"),
				new Vehicle(3, "Bike"),
				new Vehicle(1, "Truck"));
		vehicle.stream()
		//.sorted (Comparator.comparing (Vehicle::getVName)).reversed()	// B - does not compile
		//.map(v -> v.getVId()).sorted()		// C - output 123
		
		.sorted((v1, v2) -> Integer.compare(v1.getVId(), v2.getVId()))	// D - TruckCarBike
		//.sorted(Comparator.comparing ((Vehicle v) -> v.getVId()))		// E - TruckCarBike	
		
		.forEach(System.out::print);

	}

}
