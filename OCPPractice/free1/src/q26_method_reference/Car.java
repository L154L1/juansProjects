// Which code fragment creates an instance of Car?
// A. Car auto = Car (“MyCar”)::new;
// B. Car auto = Car::new;
//	  Car vehicle = auto::getCar(“MyCar”);
// C. Rideable rider = Car::new;
//    Car vehicle = rider.getCar(“MyCar”);
// D. Car vehicle = Rideable::new::getCar(“MyCar”);

// Correct Answer: C

package q26_method_reference;

interface Rideable {				// This is a functional interface so it can be implemented as lambda.
		Car getCar (String name); 
	}


public class Car {
	
	private String name;
	public Car (String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Rideable rider = Car::new;
		
		//Rideable rider = s -> new Car(s);
		
		Car vehicle = rider.getCar("MyCar");

	}

}
