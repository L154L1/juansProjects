// What is the result?
// A. IT:null
// B. A NullPointerException is thrown at run time
// C. A compilation error occurs.
// D. IT:0.0

// Answer : B

package q92_DoubleSupplier;

import java.util.function.*;

public class Job {
	String name;
	Integer cost;
	Job(String name, Integer cost){
		this.name = name;
		this.cost = cost;
	}
	String getName() { return name; }
	int getCost() { return cost; }

	public static void main(String[] args) {
		Job j1 = new Job("IT", null);
		//Job j1 = new Job("IT", 0);		// will output  IT:0.0
		DoubleSupplier jS1 = j1::getCost;
		System.out.println(j1.getName() + ":" + jS1.getAsDouble());		// throws NullPointerException because cannot unbox null to int

	}

}
